package org.example.java.oops;

//Method Overloading, Compile time polymorphism, Static Binding, Early Binding



public class Polymorphism_1 {

	public static void main(String[] args) {


		//basic one
		A a = new A();
		a.show();
		a.show("-New method");
			

		//precedence/preference based example
//		C c1 = new C();
//		c1.method("c");//in C string method c

		

		//automatic promotion
//		C c1 = new C();
//		c1.method('c');//in C float method 99

		
	}
	
}

//basic example
class A{
	
	void show() {
		System.out.println("in A show");
	}
	
	void show(String s) {
		System.out.println("in A show "+s);
	}
}

//precedence/preference based example
class C{
	
	//2nd precedence due to parent data type
	void method(Object a1) {
		System.out.println("in C obj method "+ a1);
	}
	
	//1st precedence due to child data type
	void method(String a1) {
		System.out.println("in C string method "+a1);
	}
	
	//---------------------
	//automatic promotion(send char without defining any methods for it) example
	void method(float a1) {
		System.out.println("in C float method "+ a1);
	}
	
}