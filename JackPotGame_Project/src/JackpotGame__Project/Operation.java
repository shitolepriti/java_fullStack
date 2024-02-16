package JackpotGame__Project;

import java.util.Scanner;



public class Operation {
	static Scanner sc=new Scanner(System.in);
	static UserOp uo=new UserOp();

	public static void getRagistration() {
		User us=new User();
		System.out.println("Enter your Name:");
		String Username=sc.next();
		System.out.println("Enter your Password");
		String password=sc.next();
		us.setUsername(Username);
		us.setPassword(password);
		uo.addUser(us);
		System.out.println("Registration Sucessfull!!!");
		Test.Start();
		
	}
	public static void getLogin() {
		System.out.println("Enter User Name:");
		String Username=sc.next();
		System.out.println("Enter your Password");
		String password=sc.next();
		uo.getAuthentication(Username, password);
	}
	}


