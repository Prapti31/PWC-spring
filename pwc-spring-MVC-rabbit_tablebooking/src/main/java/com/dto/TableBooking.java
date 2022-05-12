package com.dto;

public class TableBooking {
	private String bookingId;
	private int noOfPax;
	private String cusine;
	private int starRating;
	public String getBookingId() {
		return bookingId;
	}
	public void setBookingId(String id) {
		this.bookingId = id;
	}
	public int getNoOfPax() {
		return noOfPax;
	}
	public void setNoOfPax(int noOfPax) {
		this.noOfPax = noOfPax;
	}
	public String getCusine() {
		return cusine;
	}
	public void setCusine(String cusine) {
		this.cusine = cusine;
	}
	public int getStarRating() {
		return starRating;
	}
	public void setStarRating(int starRating) {
		this.starRating = starRating;
	}
	public TableBooking(String bookingId, int noOfPax, String cusine, int starRating) {
		super();
		this.bookingId = bookingId;
		this.noOfPax = noOfPax;
		this.cusine = cusine;
		this.starRating = starRating;
	}
	public TableBooking() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "TableBooking [bookingId=" + bookingId + ", noOfPax=" + noOfPax + ", cusine=" + cusine + ", starRating="
				+ starRating + "]";
	}
	
}
