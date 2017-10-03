package model;

import model.eNums.ePowerType;
import model.eNums.eWheelNumber;

public abstract class Truck extends Vehicle{
	public Truck() {
		eWheelNum = eWheelNumber.TRUCK;
		engine = new Engine(0,ePowerType.GAS);
	}
	public void show() {
		super.show();
		System.out.println("Number of Wheels: " + eWheelNum.getNumOfWheels());
	}
}
