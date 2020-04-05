package com.test.designPattern.factory;

import java.util.Calendar;

import com.test.designPattern.factory.beans.Computer;

public class ComputerClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Computer comp=ComputerFactory.createComputer(ComputerTypeEnum.PC, "100 HZ", "I7");
		Computer comp=ComputerFactory.createComputer(ComputerTypeEnum.SERVER, "100 HZ", "I7");
		int sum=comp.calculateSum(21, 2);
		System.out.println(sum);
		
	}

}
