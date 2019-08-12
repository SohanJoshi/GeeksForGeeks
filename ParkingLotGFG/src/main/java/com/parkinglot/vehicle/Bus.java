package com.parkinglot.vehicle;

import com.parkinglot.parkingspot.ParkingSpot;

public class Bus extends Vehicle {

	public Bus() {
		spotsNeeded = 5;
		size = VehicleSize.Large;
	}
	
	@Override
	public boolean canFitIntSpot(ParkingSpot spot) {
		return spot != null && spot.getVehicleSize() == VehicleSize.Large;
	}

}
