package com.peasch.controller;

import com.peasch.model.dto.UserDto;
import com.peasch.model.dto.mapper.UserMapper;
import com.peasch.model.entities.User;
import com.peasch.service.Impl.UserServiceImpl;
import com.peasch.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController

public class UserController {
    @Autowired
    private UserService service;

    @GetMapping(value="/users")
    public List<UserDto> getUsers() {
        return service.getUsers();
    }

    @GetMapping("/user/{id}")
    public UserDto getUserById(@PathVariable(value = "id") Integer id) {
        UserDto userDto = service.findById(id);

        return userDto;
    }

    @PostMapping("/user/add")
    public void addUser(@RequestBody UserDto userDto) {
        service.save(userDto);
    }
}
