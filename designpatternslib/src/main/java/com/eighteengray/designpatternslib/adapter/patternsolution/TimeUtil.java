package com.eighteengray.designpatternslib.adapter.patternsolution;

public class TimeUtil {
	private long a1;
	private long a2;
	
	public void begin(){
		a1 = System.currentTimeMillis();
	}
	public void end(){
		a2 = System.currentTimeMillis();
	}
	public void show(){
		System.out.println("times11==="+(a2-a1));
	}
}
