package com.xhub.room_book.Service.Implements;

import com.xhub.room_book.DTO.RoomDTO;
import com.xhub.room_book.Entity.Room;
import com.xhub.room_book.Entity.RoomType;
import com.xhub.room_book.Exception.NotFoundException;
import com.xhub.room_book.Repository.RoomRepository;
import com.xhub.room_book.Repository.RoomTypeRepository;
import com.xhub.room_book.Service.RoomService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RoomServiceImpl implements RoomService {

    @Autowired
    private RoomRepository roomRepo;

    @Autowired
    private RoomTypeRepository roomTypeRepo;

    private RoomDTO mapToDTO(Room room) {
        return RoomDTO.builder()
                .id(room.getRoomId())
                .roomNumber(room.getRoomNumber())
                .status(room.getStatus())
                .typeId(room.getRoomType() != null ? room.getRoomType().getRoomTypeId() : null)
                .typeName(room.getRoomType() != null ? room.getRoomType().getName() : null)
                .build();
    }

    private Room mapToEntity(RoomDTO dto) {
        RoomType type = roomTypeRepo.findById(dto.getTypeId())
                .orElseThrow(() -> new NotFoundException("RoomType not found with id: " + dto.getTypeId()));

        return Room.builder()
                .roomId(dto.getId())
                .roomNumber(dto.getRoomNumber())
                .status(dto.getStatus())
                .roomType(type)
                .build();
    }

    @Override
    public List<RoomDTO> getAllRooms() {
        return roomRepo.findAll().stream()
                .map(this::mapToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public RoomDTO getRoomById(Long id) {
        Room room = roomRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("Room not found with id: " + id));
        return mapToDTO(room);
    }

    @Override
    public RoomDTO createRoom(RoomDTO dto) {
        if (roomRepo.existsByRoomNumber(dto.getRoomNumber())) {
            throw new RuntimeException("Room already exists with number: " + dto.getRoomNumber());
        }
        Room saved = roomRepo.save(mapToEntity(dto));
        return mapToDTO(saved);
    }

    @Override
    public RoomDTO updateRoom(Long id, RoomDTO dto) {
        Room room = roomRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("Room not found with id: " + id));
        RoomType roomType = roomTypeRepo.findById(dto.getTypeId())
                .orElseThrow(() -> new NotFoundException("RoomType not found with id: " + dto.getTypeId()));

        room.setRoomNumber(dto.getRoomNumber());
        room.setStatus(dto.getStatus());
        room.setRoomType(roomType);

        return mapToDTO(roomRepo.save(room));
    }

    @Override
    public void deleteRoom(Long id) {
        if (!roomRepo.existsById(id)) {
            throw new NotFoundException("Room not found with id: " + id);
        }
        roomRepo.deleteById(id);
    }
}
