package model.concreteClasses;

import model.BuilderPattern.Engine;
import model.Interfaces.I4x4;
import model.Motorcycle;
import model.eNums.ePowerType;

public class FieldMotorcycle extends Motorcycle implements I4x4{
	public FieldMotorcycle() {
		engine = engine = new Engine.EngineBuilder(ePowerType.GAS)
				.milage(0)
				.efficiancy((float)0.4)
				.numberOfPistons(14)
				.build();

	}
	@Override
	public void switchTo4x4() {
		// TODO Auto-generated method stub
		
	}
	public void show() {
		super.show();
		System.out.println("This is a field Motorcycle");
	}
}
