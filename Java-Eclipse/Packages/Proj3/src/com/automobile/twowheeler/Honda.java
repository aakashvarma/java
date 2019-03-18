package com.automobile.twowheeler;

import com.automobile.Vehicle;

public class Honda extends Vehicle{
	public String getModelName(){
		return "Honda";
	}
	public String getRegistrationNumber(){
		return "TS29G1234";
	}
	public String getOwnerName(){
		return "Aakash Varma";
	}
	public int getSpeed(){
		return 70;
	}
	public void cdplayer(){
		System.out.println("Controls the CD player.");
	}
}
