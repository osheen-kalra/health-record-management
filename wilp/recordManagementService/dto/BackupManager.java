package com.expedia.www.eginsurance.wilp.recordManagementService.dto;

import lombok.Data;
import java.util.Date;

@Data
public class BackupManager {
    private String backupID;
    private Date backupDate;
    private String backupStatus;
    private String backupLocation;
}
