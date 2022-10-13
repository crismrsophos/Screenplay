package com.sophossolutions.certificacion.utils;

import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;

public class GetTarget {

    public static List<By> ofApp(String app) {

        switch (app) {
            case "Automation":
                return MappingLogin.automationFields();
            case "Guru":
                return MappingLogin.guruFields();
            case "Sauce":
                return MappingLogin.sauceDemoFields();
            default:
                break;
        }
        return Collections.emptyList();
    }

}