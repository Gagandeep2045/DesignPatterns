package com.test.designPattern.builder;

public class ComputerClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer c = Computer.builder().cpu("Intel").ram("4 GB").hasGraphicCard(true).build();
		System.out.println(c);
		//Read ReadMeGagan.txt
	}

}
