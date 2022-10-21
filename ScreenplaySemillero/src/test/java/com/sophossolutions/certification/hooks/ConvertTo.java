package com.sophossolutions.certification.hooks;

import java.util.List;

import com.sophossolutions.certification.models.UserInformation;
import com.sophossolutions.certification.models.UserCredential;

import io.cucumber.java.DataTableType;

public class ConvertTo {
    @DataTableType
    public UserCredential theModel(List<String> entry) {
        return new UserCredential(entry.get(0), entry.get(1));
    }

    @DataTableType
    public UserInformation theUserInformationModel(List<String> entry) {
        return new UserInformation(entry.get(0), entry.get(1), entry.get(2));
    }
}
