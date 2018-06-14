package com.eighteengray.designpatternslib.simplefactory.patternsolution_expand;

/**
 * �ͻ��ˣ�����ʹ��Api�ӿ�
 */
public class Client
{
	public static void main(String[] args)
	{
		// ��Ҫ�ı䣬û��new Impl()�ˣ�ȡ����֮Factory.createApi()

		Api api = Factory.createApi();
		api.test1("��������Ҫ���ţ�ֻ�Ǹ����Զ��ѣ�");
	}
}
