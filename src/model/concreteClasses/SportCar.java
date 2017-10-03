package model.concreteClasses;

import model.Car;
import model.Engine;
import model.ISport;
import model.eNums.ePowerType;

public class SportCar extends Car implements ISport{
	public SportCar() {
		engine = new Engine(0,ePowerType.GAS);
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
