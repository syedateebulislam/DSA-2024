package org.example.design.Design_Pattern.Builder_Pattern;

public class Process {
	public static void main(String[] args) {
		Vehicle v1=new
				Vehicle	//Outer vehicle class
				.Builder("UP60 V 0123")	//inner Builder class
				.modelType("Scooty")			//optional field 1 setter
				.modelName("Activa")			//optional field 2 setter
				.Build();	//Inner Build const called, which finally calls outer class object constructor
		System.out.println(v1.toString());
	}
}
