package com.automobile.fourwheeler;

import com.automobile.Vehicle;

public class Logan extends Vehicle{
	public String getModelName(){
		return "Logan";
	}
	public String getRegistrationNumber(){
		return "TS29G1234";
	}
	public String getOwnerName(){
		return "Aakash Varma";
	}
	public int speed() {
		return 120;
	}
	public int gps() {
		return 30;
	}
}
