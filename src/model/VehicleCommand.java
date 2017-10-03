package model;

import model.concreteClasses.ElectricCar;
import model.concreteClasses.FieldMotorcycle;
import model.concreteClasses.FieldTruck;
import model.concreteClasses.HoverCar;
import model.concreteClasses.HoverMotorcycle;
import model.concreteClasses.HoverTruck;
import model.concreteClasses.SportCar;
import model.concreteClasses.SportMotorcycle;
import model.eNums.eHerzeliaBuildableVehicles;
import model.eNums.ePetahTikvaBuildableVehicles;
import model.eNums.eVehicleTypes;

public class VehicleCommand {
	public static Vehicle orderBuild(eVehicleTypes eType) {
		if(eHerzeliaBuildableVehicles.contains(eType.toString()) ) {
			return HerzeliaVehicleFactory.getInstance().buildVehicle(eType);
		}
		else if(ePetahTikvaBuildableVehicles.contains(eType.toString())) {
			return PetahTikvaVehicleFactory.getInstance().buildVehicle(eType);
		}
		
		System.out.println("Trying to build a vehicle that isn't in the system"); // sanity check, won't get here
		return null; 
	}
}
