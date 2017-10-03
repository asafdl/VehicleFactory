package model.concreteClasses;

import model.Car;
import model.IHoverable;

public class HoverCar extends Car implements IHoverable {
	public void hover() {}
	public void show() {
		super.show();
		System.out.println("This is a hover Car");
	}
}
