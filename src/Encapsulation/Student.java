package Encapsulation;

public class Student {
	int rollNo;
	String Name;
	String dept;
	
	
	

@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", Name=" + Name + ", dept=" + dept + "]";
	}

public static void main(String args[]) {
	Student st=new Student();
	st.rollNo=10;
	st.Name="Prity";
	st.dept="CSE";
	
	System.out.println(st);
}
}