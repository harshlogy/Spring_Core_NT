package com.spring.beans;

import java.util.Date;

public class WishMessageGenerator {
	
	private Date date;

	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator 0-param constructor");
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	public String generateMessage(String user) {
		System.out.println("WishMessageGenerator.generateMessage()");
		int hour = date.getHours(); // current hour for the day
		
		//generate wish message
		if(hour < 12) {
			return "Good Morning "+user;
		}else if(hour < 16) {
			return "Good Afternoon "+user;
		}else if(hour < 20) {
			return "Good evening "+user;
		}else {
			return "Good Night "+user;
		}
		
		
	}
}
