package com.Encapsulation;

public class Employee {
	private int empid;
	private String name;
	private int Salary;
	
	public void setEmpid(int empid) {
		this.empid=empid;
	}
	
    public int getEmpid() {
	return empid;
}
    
     public void setName(String name) {
	this.name=name;
}

     public String getname() {
    	 return name;
     }
     
     public void setSallary(int Salary) {
    	 this.Salary=Salary;
     }
     public int getSallary() {
    	 return Salary;
     }
}
