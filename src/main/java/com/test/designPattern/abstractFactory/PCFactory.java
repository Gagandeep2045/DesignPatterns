package com.test.designPattern.abstractFactory;

import com.test.designPattern.factory.beans.Computer;
import com.test.designPattern.factory.beans.PC;

public class PCFactory implements ComputerAbstractFactory {

	private String cpu;
	private String hardware;

	public Computer createComputer() {
		return new PC(cpu, hardware);
	}

	public PCFactory(String cpu, String hardware) {
		this.cpu = cpu;
		this.hardware = hardware;
	}

}
