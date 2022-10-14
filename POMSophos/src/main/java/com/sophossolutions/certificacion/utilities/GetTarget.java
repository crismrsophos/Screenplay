package com.sophossolutions.certificacion.utilities;

import io.netty.util.Mapping;
import org.openqa.selenium.By;

import java.util.Collections;
import java.util.List;

public class GetTarget {

    public static List<By> ofApp(String app){

        switch (app){
            case "Automation":
                return MappingLogin.automationFields();
            case "Guru":
                return MappingLogin.guruFields();
            case "SauceDemo":
                return MappingLogin.sauceDemoFields();
            default:
                break;
        }
        return Collections.emptyList();
    }
}
