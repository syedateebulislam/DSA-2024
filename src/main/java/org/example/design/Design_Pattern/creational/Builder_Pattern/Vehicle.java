package org.example.design.Design_Pattern.creational.Builder_Pattern;


/*
1-private constructor - (abnormal stuff 1 : Take inner class Builder in inp param)
2-Nested Builder Class - (abnormal stuff 2 : Create inner class Builder with same fields)
3-Normal Builder const - (abnormal stuff 3 : public Builder const with mandatory fields in inp param)
4-All optional value setters - (abnormal stuff 4 : With return type as inner Builder class)
5-Build constructor - (abnormal stuff 5 : Outer Vehicle class Build const to return Vehicle of current instance type)
*/


public class Vehicle {
	
	private String numPlate;	//user defined mandatory field
	private String modelType;
	private String modelName;
	
	//1-private constructor - (abnormal stuff 1 : Take inner class Builder in inp param)
	private Vehicle(Builder b) {
		this.numPlate=b.numPlate;
		this.modelType=b.modelType;
		this.modelName=b.modelName;
	}

	//2-Nested Builder Class - (abnormal stuff 2 : Create inner class Builder with same fields)
	public static class Builder{

		private String numPlate;//mandatory
		private String modelType;
		private String modelName;

		
		//3-Normal Builder const - (abnormal stuff 3 : public Builder const with mandatory fields in inp param)
		public Builder(String numplate) {
			this.numPlate=numplate;
		}
		
		//4-All optional value setters - (abnormal stuff 4 : With return type as inner Builder class)
		public Builder modelType(String value) {
			this.modelType=value;
			return this;
		}

		public Builder modelName(String value) {
			this.modelName=value;
			return this;
		}

		//5-Build constructor - (abnormal stuff 5 : Outer Vehicle class Build const to return Vehicle of current instance type)
		public Vehicle Build() {
			return new Vehicle(this);
		}

	}

	@Override
	public String toString() {
		return "\nVehicle{" +
				"numPlate='" + numPlate + '\'' +
				", modelType='" + modelType + '\'' +
				", modelName='" + modelName + '\'' +
				'}';
	}

}