package com.expedia.www.eginsurance.wilp.userService.dto;

import lombok.Data;

@Data
public class UserPreferences {
    private String userID;
    private String preferredLanguage;
    private Object notificationSettings;
    private Object privacySettings;
}
