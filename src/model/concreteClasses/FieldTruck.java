package model.concreteClasses;

import model.I4x4;
import model.Truck;

public class FieldTruck extends Truck implements I4x4{

	@Override
	public void switchTo4x4() {
		// TODO Auto-generated method stub
		
	}
	public void show() {
		super.show();
		System.out.println("This is a field Truck");
	}
}
