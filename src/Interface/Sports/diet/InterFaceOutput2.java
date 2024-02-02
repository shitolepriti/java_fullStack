package Interface.Sports.diet;

import java.util.Scanner;

public abstract class InterFaceOutput2 implements Diet{
	public static void getDiet() {
		Scanner sc=new Scanner(System.in);
		System.out.println("press 1 for veg\npress 2 for nonveg");
		int ch=sc.nextInt();
		switch(ch) {
		case 1:
			Veg vg=new Veg();
			//vg.getDailyworkout();
			//vg.getPractice();
			System.out.println(vg.getBreakfast());
			System.out.println(	vg.getLunch());
			break;
			
			
			
		case 2:
			NonVeg obj=new NonVeg();
			System.out.println(obj.getBreakfast());
			System.out.println(obj.getLunch());
			break;
			default:
				System.out.println("invalid Choice");
			
	}
}

}
