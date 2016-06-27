package com.training;

import com.training.ifaces.Automobile;

public class ShowRoom {

	public Automobile getModel(int key){
		
		switch(key){
		case 1:
			return new MarutiCar();
		case 2:
			return new ToyotoCar();
			default:
				return null;
		}
	}
	
	/*
	 * Method is used to print the quotation of vehicles
	 */
	public void printQuote(Automobile polyAuto)
	{
		System.out.println(Automobile.SHOWROOM_NAME);
		
		System.out.println(polyAuto.getColor());
		System.out.println(polyAuto.getModel());
		System.out.println(polyAuto.getPrice());
	}
	

}
