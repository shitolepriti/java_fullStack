package SecondQuestion;

import java.util.HashSet;
import java.util.Set;

public class EmployeeHashset {
	 public static void main(String[] args) {
	        
	        Set<Employee> employeeSet = new HashSet<>();

	       
            Employee emp1 = new Employee("Priti", 1, 20000, 25, 4);
            Employee emp2 = new Employee("Sakshi", 2, 40000, 35, 9);
	        Employee emp3 = new Employee("Rohini", 3, 60000, 28, 5);

	        employeeSet.add(emp1);
	        employeeSet.add(emp2);
	        employeeSet.add(emp3);
	        System.out.println(employeeSet);
	        employeeSet.remove(emp1);
	        System.out.println(employeeSet);
	        employeeSet.contains(emp3);
	        System.out.println();
	        System.out.println(employeeSet);


	        System.out.println("**************Employee Information:****************");
	        for (Employee emp : employeeSet) {
	            System.out.println("Name: " + emp.getName());
	            System.out.println("Employee ID: " + emp.getEid());
	            System.out.println("Salary: " + emp.getSalary());
	            System.out.println("Age: " + emp.getAge());
	            System.out.println("Experience: " + emp.getExperience());
	            System.out.println();
	        }
	    }
	}


