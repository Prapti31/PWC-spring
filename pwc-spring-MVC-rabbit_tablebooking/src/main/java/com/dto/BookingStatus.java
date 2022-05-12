package com.dto;

public class BookingStatus {
	private TableBooking booking;
	private String bookingStatus;
	private String bookingMessage;
	public TableBooking getBooking() {
		return booking;
	}
	public void setBooking(TableBooking booking) {
		this.booking = booking;
	}
	public String getBookingStatus() {
		return bookingStatus;
	}
	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}
	public String getBookingMessage() {
		return bookingMessage;
	}
	public void setBookingMessage(String bookingMessage) {
		this.bookingMessage = bookingMessage;
	}
	public BookingStatus(TableBooking booking, String bookingStatus, String bookingMessage) {
		super();
		this.booking = booking;
		this.bookingStatus = bookingStatus;
		this.bookingMessage = bookingMessage;
	}
	public BookingStatus() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "BookingStatus [booking=" + booking + ", bookingStatus=" + bookingStatus + ", bookingMessage="
				+ bookingMessage + "]";
	}
	
}
