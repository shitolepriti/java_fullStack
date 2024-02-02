package com.Encapsulation;
import java.util.*;

public class Myapp {
	public static void main(String args[]) {
		while(true) {
		Scanner sc=new Scanner(System.in);
		//while use because  get the loop
		
		System.out.println("press 1 for set Employee Data\npress 2 for get Employee data");
		// int ch=sc.nextInt();
		//Direct decalre
		 switch(sc.nextInt()) {
		
		case 1:
			App.setData();
			break;
		case 2:
			App.getData();
			break;
			
		}
	}

}
}
