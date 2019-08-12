package com.parkinglot.vehicle;

import com.parkinglot.parkingspot.ParkingSpot;

public class Car extends Vehicle {

	public Car() {
		spotsNeeded = 3;
		size = VehicleSize.Compact;
	}
	
	@Override
	public boolean canFitIntSpot(ParkingSpot spot) {
		return spot != null && 
				(spot.getVehicleSize() == VehicleSize.Compact 
						|| spot.getVehicleSize() == VehicleSize.Large);
	}
	
}
