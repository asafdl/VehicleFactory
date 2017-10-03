package model.concreteClasses;

import model.IHoverable;
import model.Truck;

public class HoverTruck extends Truck implements IHoverable {

	@Override
	public void hover() {
		// TODO Auto-generated method stub
		
	}
	public void show() {
		super.show();
		System.out.println("This is a hover Truck");
	}
	
}
