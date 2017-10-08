package model.concreteClasses;

import model.BuilderPattern.Engine;
import model.Interfaces.ISport;
import model.Motorcycle;
import model.eNums.ePowerType;

public class SportMotorcycle extends Motorcycle implements ISport{

	public SportMotorcycle() {
		engine = new Engine.EngineBuilder(ePowerType.ELECTRIC)
				.milage(0)
				.efficiancy((float)0.9)
				.numberOfPistons(28)
				.build();

	}

	@Override
	public void sportDrive() {
		// TODO Auto-generated method stub
		
	}
	public void show() {
		super.show();
		System.out.println("This is a sport Motorcycle");
	}
	
}
