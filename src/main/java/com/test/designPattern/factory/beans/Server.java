package com.test.designPattern.factory.beans;

public class Server implements Computer {

	String cpu;
	String hardware;

	public Server(String cpu, String hardware) {
		super();
		this.cpu = cpu;
		this.hardware = hardware;
	}

	@Override
	public int calculateSum(int a, int b) {
		System.out.print("Server is calculating sum=");
		return a+b;
	}

	public String getCpu() {
		return cpu;
	}

	public String getHardware() {
		return hardware;
	}
}
