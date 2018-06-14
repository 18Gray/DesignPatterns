package com.eighteengray.designpatternslib.abstractfactory.patternsolution_common;

public class Client {

	public static void main(String[] args) {
		//�������󹤳�����
		AbstractFactory af = new ConcreteFactory1();
		//ͨ�����󹤳�����ȡһϵ�еĶ������ƷA�Ͳ�ƷB
		af.createProductA();
		af.createProductB();
	}
}
