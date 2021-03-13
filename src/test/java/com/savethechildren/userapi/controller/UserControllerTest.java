package com.savethechildren.userapi.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.savethechildren.userapi.dto.UserDTO;
import com.savethechildren.userapi.service.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@ExtendWith(MockitoExtension.class)
public class UserControllerTest {

    @Mock
    private UserService userService;

    private MockMvc mockMvc;
    private ObjectMapper objectMapper;

    @BeforeEach
    void setup() {

        mockMvc = MockMvcBuilders.standaloneSetup(new UserController(userService)).build();
        objectMapper = new ObjectMapper();
    }

    @Test
    void createUser_should_return_201() throws Exception {

        UserDTO userDTO = new UserDTO("testUser", "testEmail@email.com",
                "0123456789", "flat 00, wellington manor, test, uk");

        mockMvc.perform(post("/user")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(userDTO))
                .characterEncoding("utf-8"))
                .andExpect(status().is(201));
    }


}
