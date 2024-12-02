package org.example.design.Design_Pattern.Factory_Pattern;

public class VehicleFactory {
	
	public Vehicle getVehicle(VehicleType v) {
		return v.getVehicle();
	}
}
