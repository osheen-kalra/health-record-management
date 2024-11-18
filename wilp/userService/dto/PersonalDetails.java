package com.expedia.www.eginsurance.wilp.userService.dto;

import lombok.Data;

import java.util.List;

@Data
public class PersonalDetails {
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String gender;
    private String address;
    private String phoneNumber;
    private String email;
}
