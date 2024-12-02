package org.example.design.solid.solid_3_Liskov.School_Without_Liskov;

public class SubstituteTeacher extends Teacher{

	@Override
	public void teach() throws canNotTeachException{
		//do nothing or
		throw new canNotTeachException();
	}
	
}
