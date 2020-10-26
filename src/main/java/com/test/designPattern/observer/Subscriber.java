package com.test.designPattern.observer;

public class Subscriber implements Observer {
	private String observedMessage;

	private String observerName;

	public Subscriber(String observerName) {
		this.observerName = observerName;
	}

	@Override
	public void showObservation() {
		String x = "Observation from : " + observerName + observedMessage;
		System.out.println(x);
	}

	@Override
	public void updateObservation(String msg) {
		this.observedMessage = msg;
	}

}
