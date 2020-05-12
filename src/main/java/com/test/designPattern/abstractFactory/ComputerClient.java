package com.test.designPattern.abstractFactory;

import com.test.designPattern.factory.beans.Computer;

public class ComputerClient {

	public static void main(String args[]) {

		//AbstractComputerFactory af= new PCFactory("hardware","cpu");
		ComputerAbstractFactory af= new LaptopFactory("hardware","cpu","graphicCard");
		Computer c=ComputerFactory.createComputer(af);
		int sum=c.calculateSum(2, 3);
		System.out.print(sum);
		
	}
}
