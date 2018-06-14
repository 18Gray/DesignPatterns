package com.eighteengray.designpatternslib.simplefactory.patternsolution;

/**
 * �ͻ��ˣ�ʹ��Api�ӿ�
 */
public class Client
{
	public static void main(String[] args)
	{
		// ͨ���򵥹�������ȡ�ӿڶ���
		Api api = Factory.createApi(1);

		api.operation("����ʹ�ü򵥹���");
	}
}
