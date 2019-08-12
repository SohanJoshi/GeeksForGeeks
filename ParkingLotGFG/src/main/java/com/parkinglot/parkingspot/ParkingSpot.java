package com.parkinglot.parkingspot;

import com.parkinglot.vehicle.Vehicle;
import com.parkinglot.vehicle.VehicleSize;

public class ParkingSpot {

	private Vehicle vehicle;
	private VehicleSize vehicleSize;
	private int row;
	private int spotNumber;
	private int level;
	
	public ParkingSpot(VehicleSize vehicleSize, int row, int spotNumber, int level) {
		super();
		this.vehicleSize = vehicleSize;
		this.row = row;
		this.spotNumber = spotNumber;
		this.level = level;
	}
	
	public boolean isAvailable() {
		return vehicle == null;
	}
	
	public boolean canFitVehicle(Vehicle v) {
		return v.canFitIntSpot(this);
	}
	
	public boolean park(Vehicle v) {
		if(vehicle != null)
			return false;
		vehicle = v;
		return true;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public VehicleSize getVehicleSize() {
		return vehicleSize;
	}

	public void setVehicleSize(VehicleSize vehicleSize) {
		this.vehicleSize = vehicleSize;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getSpotNumber() {
		return spotNumber;
	}

	public void setSpotNumber(int spotNumber) {
		this.spotNumber = spotNumber;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
	
	public Vehicle removeVehicle() {
		Vehicle temp = vehicle;
		return temp;
	}
}
