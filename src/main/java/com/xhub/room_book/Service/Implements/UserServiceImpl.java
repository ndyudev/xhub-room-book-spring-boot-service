package com.xhub.room_book.Service.Implements;

import com.xhub.room_book.DTO.UserDTO;
import com.xhub.room_book.Entity.User;
import com.xhub.room_book.Mapper.UserMapper;
import com.xhub.room_book.Repository.UserRepository;
import com.xhub.room_book.Service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public UserDTO createUser(User user) {
        User saved = userRepository.save(user);
        return UserMapper.toDTO(saved);
    }

    @Override
    public List<UserDTO> getAllUsers() {
        return userRepository.findAll().stream()
                .map(UserMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public UserDTO getUserById(Long id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));
        return UserMapper.toDTO(user);
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}

