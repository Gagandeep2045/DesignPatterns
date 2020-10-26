package com.test.designPattern.observer;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Channel implements Subject {

	private Set<Observer> observers = new HashSet<>();

	String channelId;
	private boolean isStateChanged;

	public Channel(String channnelId) {
		this.channelId = channnelId;
	}

	@Override
	public void notifyAllObservers(String msg) {
		if (isStateChanged) {
			System.out.println("Channel: " + channelId + "is notifying all");
			final String msg1 = " from : " + channelId + " " + msg;
			observers.forEach(observer -> observer.updateObservation(msg1));
			this.isStateChanged = false;
		}
	}

	@Override
	public void registerObserver(Observer o) {
		observers.add(o);

	}

	@Override
	public void deregisterObserver(Observer o) {
		observers.remove(o);
	}

	public boolean equals(Object obj) {
		Channel that = (Channel) obj;
		return Objects.equals(this.channelId, that.channelId);
	}

	@Override()
	public int hashCode() {
		return Objects.hash(this.channelId);
	}

	@Override
	public void performAction(Object obj) {
		System.out.println("Action accomplished of uploading video");
		String msg = (String) obj;
		this.isStateChanged = true;
		notifyAllObservers(msg);

	}
}
