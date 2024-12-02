package org.example.java.oops;

public class ThisKeyword {

	public static void main(String[] args) {
		Abc obj1 = new Abc(5);
		obj1.show();
	}

}


class Abc{
	
	private int x;	//Instance Variable
	
	public Abc(int x) 	//Local Variable
	{
		this.x=x;	//Current Variable
	}
	
	public void show() {
		System.out.println(x);
	}
	
}