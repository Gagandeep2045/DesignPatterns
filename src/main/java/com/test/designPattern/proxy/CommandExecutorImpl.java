package com.test.designPattern.proxy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CommandExecutorImpl implements CommandExecutor {

	@Override
	public void execute(String cmd) throws Exception {

		Process pr = Runtime.getRuntime().exec(cmd);

		BufferedReader input = new BufferedReader(new InputStreamReader(pr.getInputStream()));

		String line = null;

		while ((line = input.readLine()) != null) {
			System.out.println(line);
		}

		int exitVal = pr.waitFor();
		System.out.println("Exited with error code " + exitVal);
	}

}
