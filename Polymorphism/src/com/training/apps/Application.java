package com.training.apps;

import com.training.ifaces.Automobile;

import java.util.Scanner;
import java.util.*;

import com.training.ShowRoom;
import com.training.NewShowRoom;

public class Application {
	
	public static void main(String[] args)
	{
		
		Scanner sc =new Scanner(System.in);
		String ch="Y";
		do{
		System.out.println("Enter 1 for Maruti 2 for Toyoto 3 for Bike");
		int key=sc.nextInt();
		
		
		ShowRoom obj=new NewShowRoom();
		
			Automobile polyAuto=obj.getModel(key);
			
				
			if(polyAuto==null)
			{
				System.out.println("Invalid Choice");
			}
			else
			{
			obj.printQuote(polyAuto);
	}
			System.out.println("Y to continue n to Exit");
			ch=sc.next();

      }while(ch.equalsIgnoreCase("Y"));
			
			sc.close();
	}
}