package model.concreteClasses;

import model.IHoverable;
import model.Motorcycle;

public class HoverMotorcycle extends Motorcycle implements IHoverable {
	public void hover() {}
	public void show() {
		super.show();
		System.out.println("This is a hover Motorcycle");
	}
}
