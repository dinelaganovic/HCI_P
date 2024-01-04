package com.example.backend.Service.impl;

import com.example.backend.Dto.LoginDTO;
import com.example.backend.Dto.UserDTO;
import com.example.backend.Entity.User;
import com.example.backend.Repo.UserRepository;
import com.example.backend.Service.UserService;
import com.example.backend.response.LoginResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserIMPL implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Override
    public String createUser(UserDTO userDto) {
        if (userRepository.findByUsername(userDto.getUsername()) != null) {
            throw new RuntimeException("Username already exists");
        }

        if (userRepository.findByEmail(userDto.getEmail()) != null) {
            throw new RuntimeException("Email already exists");
        }

        User user = new User(
                userDto.getId(),
                userDto.getUsername(),
                userDto.getEmail(),
                passwordEncoder.encode(userDto.getPassword())
        );
        userRepository.save(user);
        return user.getUsername();
    }

    @Override
    public LoginResponse loginUser(LoginDTO loginDto){
        String msg="";
        User user=userRepository.findByUsername(loginDto.getUsername());
        if(user!=null){
            String password=loginDto.getPassword();
            String encodedPassword=user.getPassword();
            Boolean isPwdRight=passwordEncoder.matches(password,encodedPassword);
            if (isPwdRight){
                Optional<User> usertemp=userRepository.findOneByUsernameAndPassword(loginDto.getUsername(),encodedPassword);
                if(usertemp.isPresent()){
                    return  new LoginResponse("LoginSucces", true);
                }else {
                    return  new LoginResponse("Login Failed", false);
                }
            }else {
                return  new LoginResponse("Password Not Match",false);
            }
        }else {
           return new LoginResponse("Username not exist", false);
        }

    }
    @Override
    public void deleteUser(Long id) {
        Optional<User> userOptional = userRepository.findById(id);
        if (userOptional.isPresent()) {
            userRepository.deleteById(id);
        } else {
            throw new RuntimeException("User not found with id: " + id);
        }
    }

    @Override
    public List<UserDTO> getAllUser() {
        List<UserDTO> userDTOList = new ArrayList<>();
        List<User> userList = userRepository.findAll();

        for (User user : userList) {
            userDTOList.add(new UserDTO(user.getId(), user.getUsername(), user.getEmail(), null));
        }

        return userDTOList;
    }

    @Override
    public UserDTO getUserById(Long id) {
        Optional<User> userOptional = userRepository.findById(id);
        if (userOptional.isPresent()) {
            User user = userOptional.get();
            return new UserDTO(user.getId(), user.getUsername(), user.getEmail(), null);
        } else {
            throw new RuntimeException("User not found with id: " + id);
        }
    }
}
