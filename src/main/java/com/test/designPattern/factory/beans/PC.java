package com.test.designPattern.factory.beans;

public class PC implements Computer {

	String cpu;

	public PC(String cpu, String hardware) {
		super();
		this.cpu = cpu;
		this.hardware = hardware;
	}

	String hardware;

	@Override
	public int calculateSum(int a, int b) {
		System.out.print("PC is calculating sum=");
		return a+b;
	}

	public String getCpu() {
		return cpu;
	}

	public String getHardware() {
		return hardware;
	}

}
