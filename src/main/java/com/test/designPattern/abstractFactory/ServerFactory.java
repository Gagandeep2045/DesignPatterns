package com.test.designPattern.abstractFactory;

import com.test.designPattern.factory.beans.Computer;
import com.test.designPattern.factory.beans.Server;

public class ServerFactory implements ComputerAbstractFactory {

	private String cpu;
	private String hardware;

	public Computer createComputer() {
		return new Server(cpu, hardware);
	}

	public ServerFactory(String cpu, String hardware) {
		this.cpu = cpu;
		this.hardware = hardware;
	}

}
