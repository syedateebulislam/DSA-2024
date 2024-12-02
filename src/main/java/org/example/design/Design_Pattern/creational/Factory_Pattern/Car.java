package org.example.design.Design_Pattern.creational.Factory_Pattern;

public class Car implements Vehicle{
	@Override
	public void Engine() {
		System.out.println("Car has 2000cc Engine");
	}
	@Override
	public void AvgSpeed() {
		System.out.println("Avg speed of Car is 60Kmph");
	}	
}
