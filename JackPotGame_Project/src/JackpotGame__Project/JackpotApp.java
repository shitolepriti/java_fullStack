package JackpotGame__Project;

import java.util.Random;
import java.util.Scanner;

public class JackpotApp {
	static Scanner sc=new Scanner(System.in);
	static JackPotInfo obj=new JackPotInfo();
	public static void setData() {
		System.out.println("Add the Fund more than 250 points ");
		int amount =sc.nextInt();
		obj.setAmount(amount-150);
		
		if(amount<150) {
			System.out.println("Enter more than 150");
		}else {
//			while(true) {
				System.out.println("*****Welcome to JackPot Game*****");
				
//				amount=obj.getAmount()-150;
//				obj.setAmount(amount-150);
				Random rm=new Random();
				int i =rm.nextInt(1,10);
				System.out.println(i);
				
				System.out.println("Please Enter your No");
				int c=sc.nextInt();
				if(c==i) {
					System.out.println("Winner");
					//obj.setAmount(amount+250);
					obj.setAmount(amount+150);
					
				}else {
					System.out.println("Looser");
					//obj.getAmount();
					obj.setAmount(amount-150);
				}
				
			}
		}
//	}
public static void getData() {
	System.out.println("Your Amount Is:"+obj.getAmount());
}
}
