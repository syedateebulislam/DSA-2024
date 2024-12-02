package org.example.design.solid.solid_5_DIP.Device_Factory;

public abstract class GeneralProcess {
	
	
	protected abstract  void Assemble();
	protected abstract void Test();
	protected abstract void Pack();
	protected abstract void Store();

	public void startMfg() {
			Assemble();
			Test();
			Pack();
			Store();
	}
}
