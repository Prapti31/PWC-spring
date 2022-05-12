package com.consumer;

import org.springframework.stereotype.Component;

import com.dto.BookingStatus;

@Component
public class ConsumerApp {
	
	public void ConsumeMessage(BookingStatus bookingStatus){
		System.out.println("Message taken from Guest "+bookingStatus);
	}
}
