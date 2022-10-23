package com.sophossolutions.certification.hooks;

import java.util.List;

import com.sophossolutions.certification.models.UserCredential;

import com.sophossolutions.certification.models.UserInformation;
import com.sophossolutions.certification.models.UtestUserInfo;
import com.sophossolutions.certification.models.UtestUserAddres;
import io.cucumber.java.DataTableType;

public class ConvertTo {

	@DataTableType
	public UserCredential theModel(List<String> entry) {
		return new UserCredential(entry.get(0), entry.get(1));
	}

	@DataTableType
	public UserInformation information(List<String> entry) {
		return new UserInformation(entry.get(0), entry.get(1), entry.get(2));
	}

	@DataTableType
	public UtestUserInfo uTesUserPersonalImfo(List<String> entry){
		return new UtestUserInfo(entry.get(0), entry.get(1), entry.get(2), entry.get(3),entry.get(4),entry.get(5), entry.get(6), entry.get(7));
	}

	@DataTableType
	public UtestUserAddres UTadress(List<String> entry){
		return new UtestUserAddres(entry.get(0), entry.get(1), entry.get(2));
	}
}
