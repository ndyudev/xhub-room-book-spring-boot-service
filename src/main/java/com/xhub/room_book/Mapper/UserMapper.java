package com.xhub.room_book.Mapper;


import com.xhub.room_book.DTO.UserDTO;
import com.xhub.room_book.Entity.User;

public class UserMapper {

    public static UserDTO toDTO(User entity) {
        if (entity == null) return null;
        return UserDTO.builder()
                .id(entity.getUserId())
                .username(entity.getUsername())
                .fullName(entity.getFullName())
                .role(entity.getRole())
                .build();
    }
}

