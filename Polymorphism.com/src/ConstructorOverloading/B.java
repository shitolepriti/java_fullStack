package ConstructorOverloading;

public class B {
	B(int a){
		System.out.println(" int parameter");

	}
B(String a,int b,int c){
	System.out.println("String a int b int c");

}
B(){
}
public void m1() {
	System.out.println("inside m1");

}
public static  void main(String args[]) {
	B obj=new B();
	obj.m1();
}}
