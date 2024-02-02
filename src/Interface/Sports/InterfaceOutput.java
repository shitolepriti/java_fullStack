package Interface.Sports;
import java.util.*;

import Interface.Sports.diet.NonVeg;
import Interface.Sports.diet.Veg;
public abstract class InterfaceOutput implements Coach {

	public static void getCoach() {
		Scanner sc=new Scanner(System.in);
		System.out.println("press 1 for Cricket\npress 2 for Football");
		int ch=sc.nextInt();
		switch(ch) {
		case 1:
			Cricket cr=new Cricket();
		System.out.println(	cr.getDailyworkout());
		System.out.println(	cr.getPractice());
		System.out.println(cr.getBreakfast());
		System.out.println(cr.getLunch());
			
			break;
		case 2:
			Football ft=new Football();
			System.out.println(ft.getDailyworkout());
			System.out.println(ft.getPractice());
			System.out.println(ft.getBreakfast());
			System.out.println(ft.getLunch());
			
			break;
			default:
				System.out.println("invalid Choice");
			
		}
		}
		
	
	public abstract void getcoach1();

}
