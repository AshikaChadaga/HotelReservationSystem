package com.bridgelabz.hotelreservationsystem;

public interface HotelReservationIF {
	
	public void addHotel(String hotelName,int rating, double regularCustomerRate);
	public int getHotelListSize();
	public void printHotelList();
}
