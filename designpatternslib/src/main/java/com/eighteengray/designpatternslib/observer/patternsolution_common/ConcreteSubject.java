package com.eighteengray.designpatternslib.observer.patternsolution_common;

/**
 * �����Ŀ����󣬸�����й�״̬���뵽��Ӧ�Ĺ۲��߶���
 * �����Լ�״̬�����ı�ʱ��֪ͨ�����۲���
 */
public class ConcreteSubject extends Subject {
	/**
	 * ʾ�⣬Ŀ������״̬
	 */
	private String subjectState;
	public String getSubjectState() {
		return subjectState;
	}
	public void setSubjectState(String subjectState) {
		this.subjectState = subjectState;
		//״̬�����˸ı䣬֪ͨ�����۲���
		this.notifyObservers();
	}
}

