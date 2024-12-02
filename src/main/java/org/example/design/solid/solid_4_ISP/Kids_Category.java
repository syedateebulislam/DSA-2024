package org.example.design.solid.solid_4_ISP;


public interface Kids_Category {

	//vehicles parking lot
	Ticket inParking(Person person);

	//circus
	void inCircus(Ticket ticketNum);

	//magical show
	void inMagicalShow(Ticket ticketNum);

	//roller coaster
	void inRollerCoaster(Ticket ticketNum);

	//roller coaster
	void inColumbus(Ticket ticketNum);

	//toys shop
	void inToys();

}