package com.zeta.uber.booking;

import java.util.ArrayList;
import java.util.List;

import com.zeta.uber.session.Location;

public class GoogleAPI {

	public Location getCurrentLocation() {
		return new Location();
	}
	
	public List<Location> getCabLocations() {
		return new ArrayList<Location>();
	}
}
