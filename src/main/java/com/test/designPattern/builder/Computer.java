package com.test.designPattern.builder;

public class Computer {
	private String cpu;
	private String ram;
	private boolean hasGraphicCard;

	static ComputerBuilder builder() {
		return new ComputerBuilder();
	}

	static class ComputerBuilder {
		private String cpu;
		private String ram;
		private boolean hasGraphicCard;

		ComputerBuilder cpu(String cpu) {
			this.cpu = cpu;
			return this;
		}

		ComputerBuilder ram(String ram) {
			this.ram = ram;
			return this;
		}

		ComputerBuilder hasGraphicCard(boolean hasGraphicCard) {
			this.hasGraphicCard = hasGraphicCard;
			return this;
		}

		Computer build() {
			return new Computer(this);
		}

	}

	public Computer(ComputerBuilder computerBuilder) {
		this.cpu = computerBuilder.cpu; // Outer class can access the private
										// variables of static nested class
										// inside it
		this.hasGraphicCard = computerBuilder.hasGraphicCard;
		this.ram = computerBuilder.ram;
	}

	public String toString() {
		return "CPU: " + this.cpu + " ram:" + this.ram + " hasGraphicCard:" + this.hasGraphicCard;
	}

}
