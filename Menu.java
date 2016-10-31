package com.tutorial.SIMRide;

import java.util.Scanner;

public class Menu {

	
	public static int getMenuOption(Scanner in)
	{
		System.out.println("1. Select Mountain Bike @ rate of $4/hr");
		System.out.println("2. Select Children BMX @ rate of $2/hr");
		System.out.println("3. Select Double Bike @ rate of $3/hr");
		System.out.println("4. Select Double Bike @ rate of $5/hr");
		System.out.println("5. Full Report");
		System.out.println("6. Quit");
		System.out.print("\n Enter your option: ");
		int option = in.nextInt();
		return option;
	}
	
	

}
