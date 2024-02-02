package ThisKeyword;

public class Thiskeyword {
	private int empid;
	private String name;
	private String Designation;
	
	//setter Method
	public void setEmpId(int empid) {
		this.empid = empid;
		
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public void setDesignation(String  Designation) {
		this. Designation= Designation;
	}
	
	
	//getter method
    public int getEmpId(){
	return empid;
}
    public String getName() {
	return name;
}
	public String getDesignation() {
		return  Designation;
}
	
	
	
	public static void main(String args[]) {
		Thiskeyword ts=new Thiskeyword();
		ts.setEmpId(100);
		System.out.println(ts.getEmpId());
		
		ts.setName("Priti");
		System.out.println(ts.getName());
		
		ts.setDesignation("Software Devloper");
        System.out.println(ts.Designation);
	}

}
