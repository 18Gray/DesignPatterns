package com.eighteengray.designpatternslib.simplefactory.patternsolution;

/**
 * �����࣬��������Api����
 */
public class Factory
{
	/**
	 * ����Ĵ���Api����ķ���
	 * 
	 * @param condition
	 *            ʾ�⣬���ⲿ�����ѡ������
	 * @return ����õ�Api����
	 */
	public static Api createApi(int condition)
	{
		// Ӧ�ø���ĳЩ����ȥѡ�񾿾�������һ�������ʵ�ֶ���
		// ��Щ�������Դ��ⲿ���룬Ҳ���Դ�����;����ȡ
		// ���ֻ��һ��ʵ�֣�����ʡ����������Ϊû��ѡ��ı�Ҫ

		// ʾ��ʹ������
		Api api = null;
		if (condition == 1)
		{
			api = new ImplA();
		} else if (condition == 2)
		{
			api = new ImplB();
		}
		return api;
	}
}