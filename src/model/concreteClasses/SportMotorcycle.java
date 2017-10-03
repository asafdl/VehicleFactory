package model.concreteClasses;

import model.ISport;
import model.Motorcycle;

public class SportMotorcycle extends Motorcycle implements ISport{

	@Override
	public void sportDrive() {
		// TODO Auto-generated method stub
		
	}
	public void show() {
		super.show();
		System.out.println("This is a sport Motorcycle");
	}
	
}
