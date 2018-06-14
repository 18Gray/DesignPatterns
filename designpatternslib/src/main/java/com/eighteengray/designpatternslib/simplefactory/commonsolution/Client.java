package com.eighteengray.designpatternslib.simplefactory.commonsolution;

/**
 * �ͻ��ˣ�����ʹ��Api�ӿ�
 */
public class Client
{
	public static void main(String[] args)
	{
		Api api = new Impl();

		api.test1("��������Ҫ���ţ�ֻ�Ǹ����Զ��ѣ�");
	}
}
