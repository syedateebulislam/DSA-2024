package org.example.java.oops;

public class Abstraction {

	public static void main(String[] args) {

		Iphone p1 = new Iphone(6, "13", 256);

		purchasePhone(p1);

	}

	// phone purchase task can now accept any phone type cause of abstraction
	// applied here
	public static void purchasePhone(Phone p) {

		System.out.println("Successfully purchased -" + p);

	}
}

abstract class Phone {
	//abstract class defined to just make every model acceptable for purchase method
}

class Samsung extends Phone {
	Samsung(int ram, String model, int internalMemory) {
		System.out.println("Samsung - " + model + "," + internalMemory + "," + ram);
	}
}

class Iphone extends Phone {
	Iphone(int ram, String model, int internalMemory) {
		System.out.println("iPhone - " + model + "," + internalMemory + "," + ram);
	}
}

class Nokia extends Phone {
	Nokia(int ram, String model, int internalMemory) {
		System.out.println("Nokia - " + model + "," + internalMemory + "," + ram);
	}
}