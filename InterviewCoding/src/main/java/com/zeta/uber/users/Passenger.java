package com.zeta.uber.users;

import java.util.List;

import com.zeta.uber.payment.PaymentMethod;
import com.zeta.uber.session.UberSession;

public class Passenger {

	private List<PaymentMethod> paymentMethods;
	private PaymentMethod defautlPaymentMethod;
	
	private UberSession uberSession;
	
	public void requeustAnUber() {
		if(uberSession == null)
			createSession();
		uberSession.requestAnUber();
	}
	
	public void createSession() {
		uberSession = new UberSession(this);
	}
	
}
