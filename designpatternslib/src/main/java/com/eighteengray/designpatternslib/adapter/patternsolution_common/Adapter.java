package com.eighteengray.designpatternslib.adapter.patternsolution_common;

/**
 * ������
 */
public class Adapter implements Target
{
	/**
	 * ������Ҫ������Ľӿڶ���
	 */
	private Adaptee adaptee;

	/**
	 * ���췽����������Ҫ������Ķ���
	 * 
	 * @param adaptee
	 *            ��Ҫ������Ķ���
	 */
	public Adapter(Adaptee adaptee)
	{
		this.adaptee = adaptee;
	}

	public void request()
	{
		// ����ת���Ѿ�ʵ���˵ķ�������������
		adaptee.specificRequest();
	}
}
