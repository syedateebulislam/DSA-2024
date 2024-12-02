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

/* Output Below ->
Builder constructor called
modelType setter called
modelName setter called
Build constructor to call Vehicle Const called
Vehicle constructor called

Vehicle{numPlate='UP60 V 0123', modelType='Scooty', modelName='Activa'}
 */

/*
1-private constructor - (abnormal stuff 1 : Take inner class Builder in inp param)
2-Nested Builder Class - (abnormal stuff 2 : Create inner class Builder with same fields)
3-Normal Builder const - (abnormal stuff 3 : public Builder const with mandatory fields in inp param)
4-All optional value setters - (abnormal stuff 4 : With return type as inner Builder class)
5-Build constructor - (abnormal stuff 5 : Outer Vehicle class Build const to return Vehicle of current instance type)
*/