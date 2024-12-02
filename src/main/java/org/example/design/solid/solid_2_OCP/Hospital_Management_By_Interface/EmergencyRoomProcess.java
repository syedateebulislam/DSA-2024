package org.example.design.solid.solid_2_OCP.Hospital_Management_By_Interface;

public class EmergencyRoomProcess {
	public static void main(String[] args) {
		HospitalManagement ERDirector=new HospitalManagement();

		Employee peggy = new Nurse(1,"peggy","emergency",true);		
		ERDirector.callUpon(peggy);
		
		Employee suzan = new Doctor(2,"suzan","emergency",true);
		ERDirector.callUpon(suzan);
	}
}
