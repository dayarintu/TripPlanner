package com.daya;
import java.util.Scanner;
public class TripPlanner {

	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		welcome();
		travelInfo();
		timeDifference();
		countryArea();
	}
	public static void welcome() {
		System.out.print("Welcome to Vacation Planner!");
		System.out.print("What is your name ? :  ");
		String name = scanner.next();
		System.out.print("Nice to meet you " + name + ", Which city are you travelling to? : ");
		String city = scanner.next();
		System.out.print("Great! " + city + " sounds like a great trip!!");
		System.out.println("***********************");
	}
	 
	public static void travelInfo() {
		System.out.print("How many days are you going to spend travelling? : ");
		int days = scanner.nextInt();
		System.out.print("How much money in USD , are you planning to spend on your trip? : $ ");
		double money = scanner.nextDouble();
		System.out.print("What is the three letter currency symbol for your travel destination ? : ");
		String currencySymbol = scanner.next();
		System.out.print("How many "  + currencySymbol + " are there in 1 USD ? : " );
		double originalCurrency = scanner.nextDouble();
		int hours = days * 24;
		int minutes = hours * 60;
		double spendingPerDay = money / days;
		double totalBudget = money * originalCurrency;
		double totalBudgetPerDay = totalBudget / days;
		
		
		System.out.print("If you are travelling for " + days + " days that is the same as " + hours + " hours or "
		+ minutes + " minutes ");
		System.out.print("If you are going to spend " + money + " USD that means per day you can spend up to " 
				+ spendingPerDay+ " USD ");
		System.out.print("Your total budget in " +currencySymbol+ " is " + totalBudget + " " +  currencySymbol + ", which per day is "
				+ totalBudgetPerDay + " " + currencySymbol);
		System.out.println("***************************");
		
	}
	
	public static void timeDifference() {
		System.out.print("What is the difference,  in hours , between your home and your destination ? : ");
		double hours = scanner.nextDouble();
		double localHours = 12;
		if(hours == 12) {
			localHours = 0.0;
		}
		System.out.print("That means that when it is midnight at home it will be " + hours + " in your travel destination ");
		System.out.print("and when it is noon at home it will be " + (hours + localHours) );
		System.out.println("***************************");
		
	}
	
	public static void countryArea() {
		System.out.print("What is the square area of the destination country in square kilometers ? : ");
		double area = scanner.nextDouble();
		double miles = area * 0.6213;
		System.out.print("In square miles that is " + miles );
		
		System.exit(0);
		
	}
}




















