package com.eighteengray.designpatternslib.factorymethod.patternsolution_ioc;

public class A2 extends A1 {
	protected C1 createC1() {
		//������ѡ�����ʵ�֣�����������
		return new C2();
	}
}
