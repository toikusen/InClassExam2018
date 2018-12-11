package com.exam;

import java.util.ArrayList;

public class Order {
	
	public void add(){
		ArrayList ticket = new ArrayList();
		for (int i=0 ;i<1; i++){
			Ticket t = new Ticket(i);
			ticket.add(t);
		}
		System.out.println(ticket.size());
	}

	public void print(){
		for (int i=0 ;i<1; i++){
			System.out.print("Taipei    Keelung");

		}
	}
}
