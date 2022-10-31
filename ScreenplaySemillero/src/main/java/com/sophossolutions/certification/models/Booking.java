package com.sophossolutions.certification.models;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor

public class Booking {
    private String firstname;
    private String lastname;
    private String totalprice;
    private String depositpaid;
    private BookingDates bookingdates;
    private String additionalneeds;
}
