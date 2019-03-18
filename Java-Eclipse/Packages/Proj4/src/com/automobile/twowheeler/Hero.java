package com.automobile.twowheeler;

import com.automobile.Vehicle;

public class Hero extends Vehicle{
	
	public String getModelName(){
		return "Hero";
	}
	public String getRegistrationNumber(){
		return "TS29G1234";
	}
	public String getOwnerName(){
		return "Aakash Varma";
	}
	public int getSpeed(){
		return 40;
	}
	public void radio(){
		System.out.println("Controls the radio.");
	}
	
}
