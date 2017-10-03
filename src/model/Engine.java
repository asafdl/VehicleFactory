package model;

import model.eNums.ePowerType;

public class Engine {
	protected int milege;
	protected ePowerType powerType;
	public Engine(int milage,ePowerType powerType) {
		this.milege = milage;
		this.powerType = powerType;
	}
	
}
