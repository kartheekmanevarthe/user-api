package com.savethechildren.userapi.service;

import com.savethechildren.userapi.dto.UserDTO;
import com.savethechildren.userapi.model.User;
import com.savethechildren.userapi.repositories.UserRepository;
import com.savethechildren.userapi.util.EncryptionUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.powermock.modules.junit4.PowerMockRunner;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;


@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

    @Mock
    private UserRepository userRepository;

    @Mock
    EncryptionUtils encryptionUtils;

    private UserService underTest;


    @BeforeEach
    void setup() {
        underTest = new UserService(userRepository);
    }

    @Test
    void createUser_should_create_a_user() throws NoSuchPaddingException, InvalidKeyException,
            NoSuchAlgorithmException, IllegalBlockSizeException, BadPaddingException, InvalidAlgorithmParameterException {

        UserDTO userDTO = new UserDTO("testUser", "testEmail@email.com",
                "0123456789", "flat 00, wellington manor, test, uk");

        when(userRepository.save(any(User.class))).thenReturn(new User());
        underTest.createUser(userDTO);

    }


}
