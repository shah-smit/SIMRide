package com.tutorial.SIMRide;

import java.util.Scanner;

public class MainActivity {
	static Bike[] bikes = new Bike[20];
	static String[] bikeNames = {"Mountain Bike","Children BMX","Double Bike","Bike with baby seat"};
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FullStore();
		boolean isRunnable = true;
		while(isRunnable)
		{
			int option = Menu.getMenuOption(in);
			switch(option)
			{
			case 1:
				RentABike(0);
				break;
			case 2:
				RentABike(1);
				break;
			case 3:
				RentABike(2);
				break;
			case 4:
				RentABike(3);
				break;
			case 5:
				PrintReport();
				break;
			case 6:
				isRunnable = false;
				in.close();
				break;
			}
		}
		
		System.out.println("Thank you. Have a nice day!");
			

	}
	
	public static void RentABike(int bikesValue)
	{
		boolean isEnteredValueValid = true;
		int id = 0;
		while(isEnteredValueValid)
		{
			System.out.print("Enter the id: ");
			id = in.nextInt();
			if(isValueValid(bikesValue,id))
			{
				if(bikes[id-1].isAvailable)
				{
					bikes[id-1].Hired();
					isEnteredValueValid = false;
				}
				else
				{
					System.out.println("Already hired");
					isEnteredValueValid = true;
				}
			}
		}
	}
	
	private static boolean isValueValid(int value, int id)
	{
		boolean result = true;
		switch(value)
		{
			case 0:
				if(!(id >= 1 && id <=5)) result = false;
			break;
			case 1:
				if(!(id >= 6 && id <=10)) result = false;
			break;
			case 2:
				if(!(id >= 11 && id <=15)) result = false;
			break;
			case 3:
				if(!(id >= 16 && id <=20)) result = false;
			break;
		}
		return result;
	}
	
	public static void FullStore()
	{
		for(int i=0; i<20; i++)
		{
			if(i >= 0 && i <= 4)
			{
				bikes[i] = new Bike(i,"Mountain Bike",4);
			}
			else if(i >= 5 && i <= 9)
			{
				bikes[i] = new Bike(i,"Children BMX",2);
			}
			else if(i >= 10 && i <= 14)
			{
				bikes[i] = new Bike(i,"Double Bike",3);
			}
			else if(i >= 15 && i <= 19)
			{
				bikes[i] = new Bike(i,"Bike with baby seat",5);
			}
		}
	}
	
	public static void PrintReport()
	{
		int totalSum = 0;
		System.out.printf("%-15s %-25s %5s %n","id","Name","is Available");
		System.out.println("-----------------------------------------------------------------------------------------------");

		for(int i=0; i<bikes.length; i++)
		{
			System.out.printf("%-15d %-25s %5b %n",bikes[i].id,bikes[i].name,bikes[i].isAvailable);
			if(!bikes[i].isAvailable)
			{
				totalSum += bikes[i].price;
			}
		}
		System.out.println("-----------------------------------------------------------------------------------------------");
		System.out.println("TOTAL REVENUE: "+totalSum);
		System.out.println("-----------------------------------------------------------------------------------------------");
	}

}
