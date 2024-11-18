package com.expedia.www.eginsurance.wilp.userService.dto;

import lombok.Data;

import java.util.List;

@Data
public class InsuranceDetails {
    private String policyNumber;
    private String providerName;
    private String coverageType;
    private String startDate;
    private String endDate;
}
