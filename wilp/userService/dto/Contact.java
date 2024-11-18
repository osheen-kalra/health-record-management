package com.expedia.www.eginsurance.wilp.userService.dto;

import lombok.Data;

import java.util.List;

@Data
public class Contact {
    private String name;
    private String relationship;
    private String phoneNumber;
    private String email;
}
