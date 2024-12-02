package org.example.design.solid.solid_5_DIP.Device_Manufacturing;

import org.example.design.solid.solid_5_DIP.Device_Factory.GeneralProcess;
import org.example.design.solid.solid_5_DIP.Device_Factory.Mobile;

public class DeviceFactory {
	public static void main(String[] args) {
	
		GeneralProcess p1=new Mobile();
		
		p1.startMfg();

	}	
}