package com.automobile.fourwheeler;

import com.automobile.*;

public class Ford extends Vehicle{
	public String getModelName(){
		return "Ford";
	}
	public String getRegistrationNumber(){
		return "TS29G1234";
	}
	public String getOwnerName(){
		return "Aakash Varma";
	}
	public int speed() {
		return 150;
	}
	public int tempControl() {
		return 32;
	}
}
