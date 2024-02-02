package MethodLoading;
//Compile time polymorphism
//same name different parameter
public class First {
	public void m1() {
System.out.println("no parameter");
	}
	public void m1(int a) {
		System.out.println("int parameter");
			}
	public void m1(int a,int b) {
		System.out.println("int1,int2 parameter");
			}
	public void m1(float a) {
		System.out.println("float parameter");
			}
	public void m1(String a) {
		System.out.println("String Parameter");
	}

	public static void main(String args[]) {
		First ft=new First();
		ft.m1();
		ft.m1(10);
		ft.m1(10,20);
		ft.m1(10f);
		ft.m1("Priti");

	}


}
