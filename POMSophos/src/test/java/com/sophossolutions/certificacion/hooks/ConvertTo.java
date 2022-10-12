package com.sophossolutions.certificacion.hooks;

import java.util.List;

import com.sophossolutions.certificacion.models.TShirt;
import com.sophossolutions.certificacion.models.NewUserWay2Automation;

import io.cucumber.java.DataTableType;

public class ConvertTo {

    @DataTableType
    public TShirt toTShirt(List<String> list) {
        return new TShirt(list.get(0), list.get(1), list.get(2), list.get(3), list.get(4));
    }
    @DataTableType
    public NewUserWay2Automation toNewUserWay2Automation (List<String> list) {
        return  new NewUserWay2Automation(list.get(0), list.get(1), list.get(2), list.get(3), list.get(4), list.get(5), list.get(6), list.get(7));
    }

}