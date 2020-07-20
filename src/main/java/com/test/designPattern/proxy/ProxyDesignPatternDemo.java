package com.test.designPattern.proxy;

public class ProxyDesignPatternDemo {

	public static void main(String[] args) throws Exception {

		CommandExecutor executor = new CommandExecutorProxy("admin1", "admin1");
		//executor.execute("touch abc.txt");
		executor.execute("rm abc.txt");
	}

}


