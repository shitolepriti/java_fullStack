package com.Encapsulation;
import java.util.Scanner;

public class App {
static Scanner sc=new Scanner(System.in);
static Employee emp=new Employee();

public static void setData() {
	System.out.println("Enter employee id");
	int id=sc.nextInt();
	emp.setEmpid(id);
	
	System.out.println("Enter employee name");
	String name=sc.next();
	emp.setName(name);
	
	System.out.println("Enter employee Sallary");
	//int =sc.nextInt();
	//Direct declare
	emp.setSallary(sc.nextInt());
	
}

public static void getData() {
	System.out.println("Employee id is:"+emp.getEmpid());
	System.out.println("Employee Name:"+emp.getname());
	System.out.println("Employee Salary:"+emp.getSallary());
}
}
