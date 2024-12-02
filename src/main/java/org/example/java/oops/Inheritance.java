package org.example.java.oops;

class Parent {

	void Method_1() {

		System.out.println("Inside Parent Method 1");

	}

}

// single level inheritance
class Child extends Parent {

	void Method_2() {

		System.out.println("Inside Child Method 2");

	}
}

// multi level inheritance
class GrandChild extends Child {

	void Method_3() {

		System.out.println("Inside GrandChild Method 3");

	}

}

public class Inheritance {

	public static void main(String[] args) {

		Parent p1 = new Child();
		p1.Method_1();


		//calling parent method using child class object
		Child c1 = new Child();
		c1.Method_1();

		//calling own method from own class
		GrandChild gc1 = new GrandChild();
		gc1.Method_3();

	}
}

// Is-a Relationship(Called inheritance - extend keyword)
// -> Car is a vehicle
// Has-a Relationship(Called Association - new keyword)
// -> car has a engine(Composition) , car has a music player(Aggregation).



