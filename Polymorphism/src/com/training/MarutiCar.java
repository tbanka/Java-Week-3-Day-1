package com.training;

import com.training.ifaces.Automobile;

public class MarutiCar implements Automobile {

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 20000.00D;
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "black";
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "Maruti800";
	}

}
