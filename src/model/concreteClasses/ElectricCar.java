package model.concreteClasses;

import model.Car;
import model.BuilderPattern.Engine;
import model.Interfaces.IElectric;
import model.eNums.ePowerType;

public class ElectricCar extends Car implements IElectric{

	@Override
	public void defineElectricEngine() {
		engine = new Engine.EngineBuilder(ePowerType.ELECTRIC)
				.milage(0)
				.efficiancy((float)0.8)
				.numberOfPistons(28)
				.build();
		
	}
	public void show() {
		super.show();
		System.out.println("This is an electric Car");
	}
}
