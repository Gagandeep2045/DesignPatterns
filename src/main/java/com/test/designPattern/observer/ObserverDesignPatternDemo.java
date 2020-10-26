package com.test.designPattern.observer;

public class ObserverDesignPatternDemo {

	public static void main(String[] args) {
		Subject s = new Channel("JavaBrains");
		Observer o1 = new Subscriber("Gagan");
		Observer o2 = new Subscriber("Sham");
		Observer o3 = new Subscriber("Suresh");
		s.registerObserver(o1);
		s.registerObserver(o2);
		s.registerObserver(o3);
		o1.showObservation();
		o2.showObservation();
		o3.showObservation();
		s.notifyAllObservers("Video on Java Collections uploaded");
		o1.showObservation();
		o1.showObservation();
		o1.showObservation();

	}

}
