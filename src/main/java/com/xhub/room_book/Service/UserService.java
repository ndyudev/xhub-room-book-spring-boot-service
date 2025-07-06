package com.xhub.room_book.Service;

import com.xhub.room_book.DTO.UserDTO;
import com.xhub.room_book.Entity.User;

import java.util.List;

public interface UserService {
    UserDTO createUser(User user);
    List<UserDTO> getAllUsers();
    UserDTO getUserById(Long id);
    void deleteUser(Long id);
}
