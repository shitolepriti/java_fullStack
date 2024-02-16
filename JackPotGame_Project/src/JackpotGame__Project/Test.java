package JackpotGame__Project;

import java.util.Scanner;


public class Test {
	static Scanner sc=new Scanner(System.in);
	public static void Start() {
		while(true) {
System.out.println("press 1 for Ragistration\npress 2 for Login");
switch(sc.nextInt()) {
case 1:
	Operation.getRagistration();
	break;

case 2:
	Operation.getLogin();
	break;
	}
		}
}
	public static void main(String args[]) {
		Test.Start();
		
	}
}

