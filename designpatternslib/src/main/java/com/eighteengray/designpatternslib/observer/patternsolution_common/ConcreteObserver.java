package com.eighteengray.designpatternslib.observer.patternsolution_common;

/**
 * ����۲��߶���ʵ�ָ��µķ�����ʹ�����״̬��Ŀ���״̬����һ��
 */
public class ConcreteObserver implements Observer {
	/**
	 * ʾ�⣬�����ߵ�״̬
	 */
	private String observerState;
	
	public void update(Subject subject) {
		// ����ĸ���ʵ��
		//���������Ҫ���¹۲��ߵ�״̬��ʹ����Ŀ���״̬����һ��
		observerState = ((ConcreteSubject)subject).getSubjectState();
	}
}

