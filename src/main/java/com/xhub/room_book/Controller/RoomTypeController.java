package com.xhub.room_book.Controller;


import com.xhub.room_book.DTO.RoomTypeDTO;
import com.xhub.room_book.Service.RoomTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/room-types")
public class RoomTypeController {

    @Autowired
    private RoomTypeService RoomTypeService;

    @GetMapping
    public List<RoomTypeDTO> getAll() {
        return RoomTypeService.getAllRoomTypes();
    }

    @GetMapping("/{id}")
    public RoomTypeDTO getById(@PathVariable Long id) {
        return RoomTypeService.getRoomTypeById(id);
    }

    @PostMapping
    public RoomTypeDTO create(@RequestBody RoomTypeDTO dto) {
        return RoomTypeService.createRoomType(dto);
    }

    @PutMapping("/{id}")
    public RoomTypeDTO update(@PathVariable Long id, @RequestBody RoomTypeDTO dto) {
        return RoomTypeService.updateRoomType(id, dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        RoomTypeService.deleteRoomType(id);
    }
}
