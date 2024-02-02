package ConstructorOverloading;

public class A {
	A(int a){
		System.out.println("Constructor");
	}
public void m1() {
	System.out.println("inside m1");

}
A(){
	
}
public static void main(String args[]) {
	A obj=new A();
	obj.m1();
}
}
