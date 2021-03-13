package com.savethechildren.userapi.dto;

import com.sun.istack.NotNull;

public class UserDTO {

    private String userName;
    private String emailAddress;
    private String phoneNumber;
    private String address;

    public UserDTO() {
    }

    public UserDTO(String userName, String emailAddress, String phoneNumber, String address) {
        this.userName = userName;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
