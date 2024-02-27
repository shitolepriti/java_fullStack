package SecondQuestion;

public class Employee {
    private String name;
    private int eid;
    private double salary;
    private int age;
    private double experience;

    public Employee(String name, int eid, double salary, int age, double experience) {
        this.name = name;
        this.eid = eid;
        this.salary = salary;
        this.age = age;
        this.experience = experience;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getExperience() {
		return experience;
	}

	public void setExperience(double experience) {
		this.experience = experience;
	}
}
