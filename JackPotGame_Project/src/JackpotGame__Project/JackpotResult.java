package JackpotGame__Project;

import java.util.Scanner;

public class JackpotResult {
public static void getJackpotInfo() {
	
	 Scanner sc=new Scanner(System.in);
	 boolean b=true;
		while(b) {
     System.out.println("Enter the choice :\npress 1 for Start the game \npress 2 for the check the balance\npress 3 for the LogOut" );
	 
	 switch(sc.nextInt()) {
	 case 1:
		 JackpotApp.setData();
		System.out.println(" ");
		break;
		
	 case 2:
		 JackpotApp.getData();
		 System.out.println(" ");
		 break;
		
	 case 3:
		 b=false;
		 Test.Start();
		  break;
	 }
}
}
}