package com.zeta.uber.session;

import com.zeta.uber.booking.Booker;
import com.zeta.uber.booking.Booking;
import com.zeta.uber.users.Passenger;

public class UberSession {

	private Passenger passenger;
	
	private Location currentLocation;
	
	public UberSession(Passenger passenger) {
		this.passenger = passenger;
	}

	public Booking requestAnUber() {
		
		updateCurrentLocation();
		return Booker.requestBooking(this );
		
	}

	private void updateCurrentLocation() {
		
	}

}
