package model.concreteClasses;

import model.BuilderPattern.Engine;
import model.Interfaces.IHoverable;
import model.Motorcycle;
import model.eNums.ePowerType;

public class HoverMotorcycle extends Motorcycle implements IHoverable {
	public HoverMotorcycle() {
		engine = new Engine.EngineBuilder(ePowerType.GAS)
				.milage(0)
				.efficiancy((float)0.7)
				.numberOfPistons(14)
				.build();

	}
	public void hover() {}
	public void show() {
		super.show();
		System.out.println("This is a hover Motorcycle");
	}
}
