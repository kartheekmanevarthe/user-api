package com.savethechildren.userapi.controller;

import com.savethechildren.userapi.dto.UserDTO;
import com.savethechildren.userapi.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;


/**
 * Controller which contains user end points
 */
@Controller
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    /**
     * Accepts a json object for UserDTO
     *
     * @param userDTO
     */
    @PostMapping("/user")
    @ResponseStatus(HttpStatus.CREATED)
    public void createUser(@RequestBody UserDTO userDTO) {

        userService.createUser(userDTO);

    }


}
