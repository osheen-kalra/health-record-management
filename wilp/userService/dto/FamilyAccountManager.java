package com.expedia.www.eginsurance.wilp.userService.dto;

import java.util.List;

import lombok.Data;

@Data
public class FamilyAccountManager {
    private String userID;
    private List<Object> dependentAccounts;
}
