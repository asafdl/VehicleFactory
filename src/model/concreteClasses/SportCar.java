package model.concreteClasses;

import model.Car;
import model.BuilderPattern.Engine;
import model.Interfaces.ISport;
import model.eNums.ePowerType;

public class SportCar extends Car implements ISport{
	public SportCar() {
		engine = new Engine.EngineBuilder(ePowerType.GAS)
				.milage(0)
				.efficiancy((float)0.9)
				.numberOfPistons(36)
				.build();

	}
	@Override
	public void sportDrive() {
		// TODO Auto-generated method stub
		
	}
	public void show() {
		super.show();
		System.out.println("This is a sport Car");
	}

}
