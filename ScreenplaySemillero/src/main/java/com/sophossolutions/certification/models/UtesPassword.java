package com.sophossolutions.certification.models;


import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class UtesPassword {
    private String password;
    private String confirmPassword;
}
