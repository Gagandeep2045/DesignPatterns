package com.test.designPattern.proxy;

public class CommandExecutorProxy implements CommandExecutor {
	private CommandExecutor executor; // private instance of RealSubject i.e CommandExecutorImpl
	private boolean isAdmin;

	public CommandExecutorProxy(String username, String password) {
		if (username.equals("admin") && password.equals("admin")) {
			isAdmin = true;
		}

		executor = new CommandExecutorImpl(); // private instance of RealSubject i.e CommandExecutorImpl

	}

	@Override
	public void execute(String cmd) throws Exception {
		if (!isAdmin && cmd.contains("rm")) {
			throw new NotAuthorizedException("Operation Not Supported");
		}
		executor.execute(cmd);
	}

}
