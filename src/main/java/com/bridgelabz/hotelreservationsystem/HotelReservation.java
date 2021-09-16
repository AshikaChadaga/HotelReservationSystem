package com.bridgelabz.hotelreservationsystem;

import java.util.HashMap;
import java.util.Map;

public class HotelReservation {
	
	Map<String, Hotel> hotelList = new HashMap<String, Hotel>();
	Hotel hotels;
	int count = 0;
	
	public boolean addHotel(String hotelName,int rating, double weekdayRateRegular, double weekendRateRegular)
	{
		hotels = new Hotel();
		hotels.setHotelName(hotelName);
		hotels.setRating(rating);
		hotels.setWeekdayRegularCustomerPrice(weekdayRateRegular);
		hotels.setWeekendRegularCustomerPrice(weekendRateRegular);
		
		hotelList.put(hotelName, hotels);
		count ++;
		System.out.println(hotelList);
		if(hotelList.size() == count)
			return true;
		else {
			return false;
		}
		
	}
	

}
