package com.test.designPattern.abstractFactory;

import com.test.designPattern.factory.beans.Computer;
import com.test.designPattern.factory.beans.Laptop;

public class LaptopFactory implements ComputerAbstractFactory {

	private String hardware;
	private String cpu;
	private String optionalGraphicCard;

	@Override
	public Computer createComputer() {
		// TODO Auto-generated method stub
		return new Laptop(hardware, cpu, optionalGraphicCard);
	}

	public LaptopFactory(String hardware, String cpu, String optionalGraphicCard) {
		super();
		this.hardware = hardware;
		this.cpu = cpu;
		this.optionalGraphicCard = optionalGraphicCard;
	}
	
	

}
