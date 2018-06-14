package com.eighteengray.designpatternslib.mediator.patternsolution_common;
/**
 * �н��ߣ��������ͬ�¶���ͨ�ŵĽӿ�
 */
public interface Mediator {
	/**
	 * ͬ�¶���������ı��ʱ����֪ͨ�н��ߵķ�����
	 * ���н���ȥ������Ӧ��������ͬ�¶���Ľ���
	 * @param colleague ͬ�¶������������н��߶���ͨ������ʵ��
	 *                  ȥ��ȡͬ�¶����״̬
	 */
	public void changed(Colleague colleague);
}