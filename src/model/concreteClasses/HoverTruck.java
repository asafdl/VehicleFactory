package model.concreteClasses;

import model.BuilderPattern.Engine;
import model.Interfaces.IHoverable;
import model.Truck;
import model.eNums.ePowerType;

public class HoverTruck extends Truck implements IHoverable {

	public HoverTruck() {
		engine = new Engine.EngineBuilder(ePowerType.GAS)
				.milage(0)
				.efficiancy((float)0.5)
				.numberOfPistons(56)
				.build();

	}
	@Override
	public void hover() {
		// TODO Auto-generated method stub
		
	}
	public void show() {
		super.show();
		System.out.println("This is a hover Truck");
	}
	
}
