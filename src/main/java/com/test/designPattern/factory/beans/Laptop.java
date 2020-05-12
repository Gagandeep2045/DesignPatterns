package com.test.designPattern.factory.beans;

public class Laptop implements Computer{
	private String hardware;
	private String cpu;
	private String optionalGraphicCard;

	public Laptop(String hardware, String cpu, String optionalGraphicCard) {
		super();
		this.hardware = hardware;
		this.cpu = cpu;
		this.optionalGraphicCard = optionalGraphicCard;
	}

	public String getHardware() {
		return hardware;
	}

	public String getCpu() {
		return cpu;
	}

	public String getOptionalGraphicCard() {
		return optionalGraphicCard;
	}

	@Override
	public int calculateSum(int a, int b) {
		// TODO Auto-generated method stub
		System.out.print("Laptop");
		return a+b;
	}

}
