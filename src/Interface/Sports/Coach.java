package Interface.Sports;
import java.util.*;
import Interface.Sports.diet.Diet;
import Interface.Sports.diet.InterFaceOutput2;

//package name=(Packagename.Class name)
public interface Coach extends Diet {

	public String getDailyworkout();
	
	public String getPractice();


public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println(" enter the your choice : \npress 1 for Coach \n press two for Diet");
	switch(sc.nextInt()) {
	case 1:
InterfaceOutput.getCoach();
		break;
	case 2:
		InterFaceOutput2.getDiet();
		break;
	}
	

}

public void getcoach1();

}
