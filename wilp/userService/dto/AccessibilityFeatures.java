package com.expedia.www.eginsurance.wilp.userService.dto;

import lombok.Data;

@Data
public class AccessibilityFeatures {
    private String userID;
    private String textSize;
    private Boolean voiceCommandsEnabled;
    private Boolean simplifiedMode;
}
