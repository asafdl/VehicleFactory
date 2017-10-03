package model;

import model.eNums.eVehicleTypes;

public interface IVehicleFactory {
	public Vehicle buildVehicle(eVehicleTypes vehicleType);
	
}
