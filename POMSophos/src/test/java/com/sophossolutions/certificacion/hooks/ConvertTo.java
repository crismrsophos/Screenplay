package com.sophossolutions.certificacion.hooks;

import java.util.List;

import com.sophossolutions.certificacion.models.Registration;
import com.sophossolutions.certificacion.models.TShirt;

import io.cucumber.java.DataTableType;

public class ConvertTo {

	@DataTableType
	public TShirt toTShirt(List<String> list) {
		return new TShirt(list.get(0), list.get(1), list.get(2), list.get(3), list.get(4));
	}


	@DataTableType
	public Registration registration(List<String> list) {
		return new Registration(list.get(0), list.get(1), list.get(2), list.get(3),
				list.get(4), list.get(5), list.get(6));
	}

}
