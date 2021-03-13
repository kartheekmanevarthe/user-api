package com.savethechildren.userapi.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

@ExtendWith(MockitoExtension.class)
public class EncryptionUtilsTest {

    @Test
    void givenString_whenEncrypt_thenSuccess() throws NoSuchAlgorithmException, IllegalBlockSizeException, InvalidKeyException, BadPaddingException, InvalidAlgorithmParameterException, NoSuchPaddingException {
        String input = "test@test.com";
        String encryptedString = EncryptionUtils.encrypt(input);
        Assertions.assertNotNull(encryptedString);
    }

}
