package com.sophossolutions.certification.hooks;

import java.util.List;
import java.util.Map;

import com.sophossolutions.certification.models.User;
import com.sophossolutions.certification.models.UserPost;
import com.sophossolutions.certification.models.*;

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

	@DataTableType
	public UtesPassword UTpassword(List<String> entry){
		return new UtesPassword(entry.get(0), entry.get(1));
	}

	@DataTableType
	public User toUserModel(Map<String, String> entry) {
		return new User(entry.get("name"), entry.get("email"), entry.get("status"), entry.get("gender"));
	}

	@DataTableType
	public UserPost toUserPost(Map<String, String> entry){
		return new UserPost (entry.get("name"), entry.get("email"),entry.get("body"));
	}

	@DataTableType
	public Booking toUserBooking(Map<String, String> entry){
		return new Booking (
				entry.get("firstname"),
				entry.get("lastname"),
				entry.get("totalprice"),
				entry.get("depositpaid"),
				new BookingDates(entry.get("checkin"),entry.get("checkout"))
				,entry.get("additionalneeds"));
	}

	@DataTableType
	public UserQa toUserQA (Map<String, String> entry){
		return new UserQa(
				entry.get("name"),
				entry.get("lastname"),
				entry.get("email"),
				entry.get("gender"),
				entry.get("mobileNumber"),
				entry.get("dateOfbirth"),
				entry.get("subjects"),
				entry.get("hobbies"),
				entry.get("pictures"),
				entry.get("address"),
				entry.get("state"),
				entry.get("city"));
	}

	@DataTableType
	public ProductAdvantage toProduct (Map<String, String> entry){
		return new ProductAdvantage(
				entry.get("category"),
				entry.get("product"),
				entry.get("color"),
				entry.get("quantity"));
	}


}
