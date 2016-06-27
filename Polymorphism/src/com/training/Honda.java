package com.training;

import com.training.ifaces.Automobile;

public class Honda implements Automobile {

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 25000;
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "white";
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "1999";
	}

}
