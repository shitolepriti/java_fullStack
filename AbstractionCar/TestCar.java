package com.AbstractionCar;
import java.util.*;
public abstract class TestCar{
	
	public static void getMS() {
	
Scanner sc=new Scanner(System.in);
System.out.println("Choose your car\npress 1 for Swift\npress 2 for Baleno");
int ch=sc.nextInt();


switch(ch) {
case 1:
Swift sw=new Swift();	
sw.getMillage();
	sw.getPrice();
	sw.getColours();
	sw.getFeature();
	sw.getMSDealers();
	break;
case 2:
    Baleno ba=new Baleno();
    ba.getMillage();
	ba.getPrice();
	ba.getColours();
	ba.getFeature();
	ba.getMSDealers();
	break;
	
	default:
		System.out.println("Invalid Choice");
}
	
}
public static void getTata() {
	
Scanner sc=new Scanner(System.in);
System.out.println("Choose your car\npress 1 for Nexon\npress 2 for Safari");
int ch=sc.nextInt();

switch(ch) {
case 1:
	TataNexon obj=new TataNexon();
	 obj.getMillage();
		obj.getPrice();
		obj.getColours();
		obj.getFeature();
		obj.getTataDealers();
		break;
		
case 2:
	TataSafari obj1=new TataSafari();
	 obj1.getMillage();
		obj1.getPrice();
		obj1.getColours();
		obj1.getFeature();
		obj1.getTataDealers();
		break;
default:
	System.out.println("Invalid Choice");

	
}

	
}

}
