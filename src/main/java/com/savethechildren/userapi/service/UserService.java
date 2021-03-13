package com.savethechildren.userapi.service;

import com.savethechildren.userapi.dto.UserDTO;
import com.savethechildren.userapi.model.User;
import com.savethechildren.userapi.repositories.UserRepository;
import com.savethechildren.userapi.util.EncryptionUtils;
import org.springframework.stereotype.Service;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

/**
 * User service responsible to encrypt and persist the user object
 */
@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    /**
     * creates and persists encrypted user data into DB
     *
     * @param userDTO
     */
    public void createUser(UserDTO userDTO) {
        User user = new User();
        try {
            user.setUserName(userDTO.getUserName());
            user.setPhoneNumber(EncryptionUtils.encrypt(userDTO.getPhoneNumber()));
            user.setEmailAddress(EncryptionUtils.encrypt(userDTO.getEmailAddress()));
            user.setEmailAddress(EncryptionUtils.encrypt(userDTO.getEmailAddress()));
            user.setAddress(EncryptionUtils.encrypt(userDTO.getAddress()));
        } catch (NoSuchPaddingException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (InvalidAlgorithmParameterException e) {
            e.printStackTrace();
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        } catch (BadPaddingException e) {
            e.printStackTrace();
        } catch (IllegalBlockSizeException e) {
            e.printStackTrace();
        }

        userRepository.save(user);

    }

}
