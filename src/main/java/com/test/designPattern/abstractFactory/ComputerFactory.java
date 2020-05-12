package com.test.designPattern.abstractFactory;

import com.test.designPattern.factory.beans.Computer;

public class ComputerFactory {

	public static Computer createComputer(ComputerAbstractFactory af)
	{
		return af.createComputer();
	}
}
