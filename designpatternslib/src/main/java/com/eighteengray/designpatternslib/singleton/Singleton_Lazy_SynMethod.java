package com.eighteengray.designpatternslib.singleton;



/**
 * ����ģʽ
 * �ŵ㣺ֻ��ʹ��ʱ��ʼ������Լ��Դ
 * ȱ�㣺��һ�μ���ʱ�ų�ʼ������Ӧ������ÿ�ε���getInstance������ͬ������ɲ���Ҫ������
 */
public class Singleton_Lazy_SynMethod
{
	private static Singleton_Lazy_SynMethod singleton = null;
	
	
	// ���Ʋ����������
	private Singleton_Lazy_SynMethod()
	{

	}

	
	// ͨ���÷������ʵ������
	public static synchronized Singleton_Lazy_SynMethod getSingleton()
	{
		if(singleton == null)
		{
			singleton = new Singleton_Lazy_SynMethod();
		}
		return singleton;
	}


	
	// ��������������������static
	public static void doSomething()
	{

	}
	
	
}
