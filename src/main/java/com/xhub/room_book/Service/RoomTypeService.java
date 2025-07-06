package com.xhub.room_book.Service;

import com.xhub.room_book.DTO.RoomTypeDTO;

import java.util.List;

public interface RoomTypeService {
    List<RoomTypeDTO> getAllRoomTypes();
    RoomTypeDTO getRoomTypeById(Long id);
    RoomTypeDTO createRoomType(RoomTypeDTO dto);
    RoomTypeDTO updateRoomType(Long id, RoomTypeDTO dto);
    void deleteRoomType(Long id);
}
