package com.parkinglot.vehicle;

import com.parkinglot.parkingspot.ParkingSpot;

import java.util.ArrayList;

public abstract class Vehicle {
	protected ArrayList<ParkingSpot> parkingSpots = new ArrayList<>();
	protected String licensePlate;
	protected int spotsNeeded;
	protected VehicleSize size;
	
	public String getLicensePlate() {
		return licensePlate;
	}
	public VehicleSize getSize() {
		return size;
	}
	
	public void parkingSpot(ParkingSpot spot) {
		parkingSpots.add(spot);
	}
	
	public void clearSpots() {
		parkingSpots.clear();
	}
	
	public abstract boolean canFitIntSpot(ParkingSpot spot) ;
	
}
