package com.eighteengray.designpatternslib.factorymethod.patternsolution_common1;
/**
 * ��������������������
 */
public abstract class Creator {
	/**
	 * ����Product�Ĺ�������
	 * @return Product����
	 */
	protected abstract Product factoryMethod();
	/**
	 * ʾ�ⷽ����ʵ��ĳЩ���ܵķ��� 
	 */
	public void someOperation() {
		//ͨ������Щ����ʵ���У���Ҫ���ù�����������ȡProduct����
		Product product = factoryMethod();
	}
}

