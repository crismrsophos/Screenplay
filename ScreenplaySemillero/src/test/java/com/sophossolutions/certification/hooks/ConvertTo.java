package com.sophossolutions.certification.hooks;

import java.util.List;

import com.sophossolutions.certification.models.BuySauce;
import com.sophossolutions.certification.models.UserCredential;

import io.cucumber.java.DataTableType;

public class ConvertTo {
    @DataTableType
    public UserCredential theModel(List<String> entry) {
        return new UserCredential(entry.get(0), entry.get(1));
    }

    @DataTableType
    public BuySauce theBuyModel(List<String> entry) {
        return new BuySauce(entry.get(0), entry.get(1), entry.get(2));
    }
}
