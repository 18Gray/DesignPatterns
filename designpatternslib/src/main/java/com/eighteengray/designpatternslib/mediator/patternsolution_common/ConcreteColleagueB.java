package com.eighteengray.designpatternslib.mediator.patternsolution_common;
/**
 * �����ͬ����B
 */
public class ConcreteColleagueB extends Colleague {
	public ConcreteColleagueB(Mediator mediator) {
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

