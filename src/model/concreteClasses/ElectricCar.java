package model.concreteClasses;

import model.Car;
import model.Engine;
import model.IElectric;
import model.eNums.ePowerType;

public class ElectricCar extends Car implements IElectric{

	@Override
	public void defineElectricEngine() {
		engine = new Engine(0,ePowerType.ELECTRIC);
		
	}
	public void show() {
		super.show();
		System.out.println("This is an electric Car");
	}
}
