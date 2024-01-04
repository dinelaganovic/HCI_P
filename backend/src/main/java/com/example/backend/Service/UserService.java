package com.example.backend.Service;

import com.example.backend.Dto.LoginDTO;
import com.example.backend.Dto.UserDTO;
import com.example.backend.response.LoginResponse;

import java.util.List;

public interface UserService {
    String createUser(UserDTO userDto);
    LoginResponse loginUser(LoginDTO loginDto);
    void deleteUser(Long id);
    List<UserDTO> getAllUser();
    UserDTO getUserById(Long id);
}
