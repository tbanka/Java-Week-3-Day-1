package com.training;

import com.training.ifaces.Automobile;

public class ToyotoCar implements Automobile {

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 500000.00;
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "Red";
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "i10";
	}

}
