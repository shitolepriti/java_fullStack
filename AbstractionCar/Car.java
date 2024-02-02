package com.AbstractionCar;
import java.util.*;
public  abstract class Car {
	public  void getCar() {
		System.out.println("******");
	}
	public abstract void getMillage();
	public abstract void getColours();
	public abstract void getPrice();
	public abstract void getFeature();


public static void main(String args[]) {
	System.out.println("Welcome to My Cars");
Scanner sc=new Scanner(System.in);
	System.out.println("Choose your Company:\n press 1 for MarutiSuzuki\n press 2 for Tata");
	int ch=sc.nextInt();
	switch(ch) {
	case 1:
		System.out.println("Welcome to Maruti Suzuki");
		MarutiSuzuki.getMS();
	break;
	case 2:
		System.out.println("Welcome to Tata");
		Tata.getTata();
		break;
		default:
			System.out.println("Invalid choice");
			
	
	}}
	
	
}

