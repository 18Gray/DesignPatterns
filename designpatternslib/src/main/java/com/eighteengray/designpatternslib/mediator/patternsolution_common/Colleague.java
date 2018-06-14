package com.eighteengray.designpatternslib.mediator.patternsolution_common;
/**
 * ͬ����ĳ�����
 */
public abstract class Colleague {
	/**
	 * �����н��߶���ÿһ��ͬ���඼֪�������н��߶���
	 */
	private Mediator mediator;
	/**
	 * ���췽���������н��߶���
	 * @param mediator �н��߶���
	 */
	public Colleague(Mediator mediator) {
		this.mediator = mediator;
	}
	/**
	 * ��ȡ��ǰͬ�����Ӧ���н��߶���
	 * @return ��Ӧ���н��߶���
	 */
	public Mediator getMediator() {
		return mediator;
	}
}