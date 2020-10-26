package com.test.designPattern.observer;

public interface Subject {

	public void notifyAllObservers(String msg);

	void registerObserver(Observer o);

	void deregisterObserver(Observer o);

	void performAction(Object obj);

}
