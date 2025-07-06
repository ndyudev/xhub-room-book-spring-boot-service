package com.xhub.room_book.Service.Implements;

import com.xhub.room_book.DTO.RoomTypeDTO;
import com.xhub.room_book.Entity.RoomType;
import com.xhub.room_book.Exception.NotFoundException;
import com.xhub.room_book.Repository.RoomTypeRepository;
import com.xhub.room_book.Service.RoomTypeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RoomTypeServiceImpl implements RoomTypeService {

    @Autowired
    private RoomTypeRepository roomTypeRepo;

    private RoomTypeDTO mapToDTO(RoomType entity) {
        return RoomTypeDTO.builder()
                .id(entity.getRoomTypeId())
                .name(entity.getName())
                .pricePerHour(entity.getPricePerHour())
                .build();
    }

    private RoomType mapToEntity(RoomTypeDTO dto) {
        return RoomType.builder()
                .roomTypeId(dto.getId())
                .name(dto.getName())
                .pricePerHour(dto.getPricePerHour())
                .build();
    }

    @Override
    public List<RoomTypeDTO> getAllRoomTypes() {
        return roomTypeRepo.findAll()
                .stream()
                .map(this::mapToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public RoomTypeDTO getRoomTypeById(Long id) {
        RoomType type = roomTypeRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("RoomType not found with id: " + id));
        return mapToDTO(type);
    }

    @Override
    public RoomTypeDTO createRoomType(RoomTypeDTO dto) {
        if (roomTypeRepo.existsByName(dto.getName())) {
            throw new RuntimeException("RoomType already exists with name: " + dto.getName());
        }
        RoomType saved = roomTypeRepo.save(mapToEntity(dto));
        return mapToDTO(saved);
    }

    @Override
    public RoomTypeDTO updateRoomType(Long id, RoomTypeDTO dto) {
        RoomType existing = roomTypeRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("RoomType not found with id: " + id));
        existing.setName(dto.getName());
        existing.setPricePerHour(dto.getPricePerHour());
        return mapToDTO(roomTypeRepo.save(existing));
    }

    @Override
    public void deleteRoomType(Long id) {
        if (!roomTypeRepo.existsById(id)) {
            throw new NotFoundException("RoomType not found with id: " + id);
        }
        roomTypeRepo.deleteById(id);
    }
}
