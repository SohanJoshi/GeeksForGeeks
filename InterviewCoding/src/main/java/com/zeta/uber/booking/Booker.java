package com.zeta.uber.booking;

import com.zeta.uber.session.UberSession;

public class Booker {
	
	private static RequestStatus currentStatus ;

	public static Booking requestBooking(UberSession uberSession) {
		BookingRequest request = new BookingRequest();
		
		currentStatus = RequestStatus.REQUEST_RECEIVED;
		request.setRequestStatus(RequestStatus.REQUEST_RECEIVED);
		
		GoogleAPI google = new GoogleAPI();
		
		new Thread(() -> request.requestCabs());
		
		return null;
	}

}
