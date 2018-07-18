package com.eighteengray.designpatternslib.command.patternsoltion_degenerate;

public class Invoker {
	public void startPrint(Command cmd){	
		System.out.println("在Invoker中，输出服务前");
		cmd.execute();
		System.out.println("输出服务结束");
	}
}