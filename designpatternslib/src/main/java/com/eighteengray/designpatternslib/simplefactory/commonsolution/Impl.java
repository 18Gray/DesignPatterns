package com.eighteengray.designpatternslib.simplefactory.commonsolution;
/**
 * 对接口的实现 
 */
public class Impl implements Api{
	
	public void test1(String s) {
		System.out.println("Now In Impl. The input s=="+s);
	}
}
