package com.test.designPattern.factory;

import com.test.designPattern.factory.beans.Computer;
import com.test.designPattern.factory.beans.PC;
import com.test.designPattern.factory.beans.Server;

public class ComputerFactory {

	public static Computer createComputer(ComputerTypeEnum type, String hardware, String cpu) {
		Computer comp = null;
		switch (type) {

		case PC:
			comp = new PC(hardware, cpu);
			break;
		case SERVER:
			comp = new Server(hardware, cpu);
			break;

		}
		return comp;
	}

}
