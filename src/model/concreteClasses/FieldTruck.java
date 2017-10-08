package model.concreteClasses;

import model.BuilderPattern.Engine;
import model.Interfaces.I4x4;
import model.Truck;
import model.eNums.ePowerType;

public class FieldTruck extends Truck implements I4x4{

	public FieldTruck() {
		engine = new Engine.EngineBuilder(ePowerType.GAS)
				.milage(0)
				.efficiancy((float)0.2)
				.numberOfPistons(56)
				.build();

	}
	@Override
	public void switchTo4x4() {
		// TODO Auto-generated method stub
		
	}
	public void show() {
		super.show();
		System.out.println("This is a field Truck");
	}
}
