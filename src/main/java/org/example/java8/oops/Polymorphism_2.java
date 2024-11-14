package org.example.java8.oops;
//Method Overriding, Run time polymorphism, Dynamic Binding, Late Binding



public class Polymorphism_2 {

	public static void main(String[] args) {
	
		Child_1 c1 = new Child_1();
		c1.show();
		
		Parent_1 p1 = new Parent_1();
		p1.show();

		// left side type ref, right side object instance
		// At compile time, it will allow method on the basis of ref type class
		// At runtime, if overridden method is defined in child, then that can be picked
		// otherwise parent method will be called.
		//note- its allowed only in Overriding due to ->
		// 1.same params of overridden method and,
		// 2.inheritance between both classes
		// In Overloading, both of the classes aren't related with each other,
		// so you can't play around with type ref or obj instance during declaration.
		// either one class is defined or not totally.
		Parent_1 p2 = new Child_1();
		p2.show();

		//compilation error
//		Child_1 c2 = new Parent_1();
		
	}
}

class Parent_1{
	
	void show() {
		System.out.println("in Parent_1 show");
	}
	
}

class Child_1 extends Parent_1{
	
	void show() {
		System.out.println("in Child_1 show");
	}
	
}