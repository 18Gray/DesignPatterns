package com.eighteengray.designpatternslib.mediator.patternsolution1;
/**
 * �н��߶���Ľӿ�
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

