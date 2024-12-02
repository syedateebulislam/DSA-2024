package org.example.design.Design_Pattern.Factory_Pattern;

public enum VehicleType {
	Car{
		public Vehicle getVehicle() {
			return new Car();
		}
	},
	Bike{
		public Vehicle getVehicle() {
			return new Bike();
		}
	};
	
	abstract Vehicle getVehicle();
}
