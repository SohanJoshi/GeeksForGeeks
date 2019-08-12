package com.parkinglot.vehicle;

import com.parkinglot.parkingspot.ParkingSpot;

public class Motorcycle extends Vehicle {

	public Motorcycle() {
		spotsNeeded = 1;
		size = VehicleSize.MotorCycle;
	}
	
	public boolean canFitIntSpot(ParkingSpot spot) {
		return spot != null && spot.getVehicleSize() != null;
	}
	
}
