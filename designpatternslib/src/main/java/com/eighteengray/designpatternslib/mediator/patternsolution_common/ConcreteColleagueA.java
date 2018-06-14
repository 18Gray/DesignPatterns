package com.eighteengray.designpatternslib.mediator.patternsolution_common;
/**
 * �����ͬ����A
 */
public class ConcreteColleagueA extends Colleague {
	public ConcreteColleagueA(Mediator mediator) {
		super(mediator);
	}
	/**
	 * ʾ�ⷽ����ִ��ĳЩҵ����
	 */
	public void someOperation() {
		//����Ҫ������ͬ��ͨ�ŵ�ʱ��֪ͨ�н��߶���
		getMediator().changed(this);
	}
}