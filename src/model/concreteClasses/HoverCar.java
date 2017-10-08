package model.concreteClasses;

import model.Car;
import model.BuilderPattern.Engine;
import model.Interfaces.IHoverable;
import model.eNums.ePowerType;

public class HoverCar extends Car implements IHoverable {
	public HoverCar() {
		engine = new Engine.EngineBuilder(ePowerType.GAS)
				.milage(0)
				.efficiancy((float)0.8)
				.numberOfPistons(28)
				.build();

	}
	public void hover() {}
	public void show() {
		super.show();
		System.out.println("This is a hover Car");
	}
}
