package com.sophossolutions.certification.models;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.lang.annotation.Target;

@Getter
@AllArgsConstructor

public class UserPersonalInfo {
    private String firtsName;
    private String lastName;
    private String emailAddress;
    private Target dateOfBirth;
}
