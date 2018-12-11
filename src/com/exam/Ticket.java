package com.exam;

public class Ticket {
	
	String origin;
	String destination;
	int quantity;
	int price;
	
	public Ticket(String origin,String destination,int quantity,int price){
		this.origin = origin;
		this.destination = destination;
		this.quantity = quantity;
		this.price = price;

	}
	
	public String get(){
		String s = (origin)+ " " +(destination)+ " " +(quantity)+ " "  +(price)+ " " + (price*quantity);
		return s;
	}
}
