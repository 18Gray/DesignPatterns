package com.eighteengray.designpatternslib.singleton;



/**
 * ����ģʽ��˫���ж�
 * �ŵ㣺ֻ��ʹ��ʱ��ʼ������Լ��Դ
 * ȱ�㣺��һ�μ��������������ڴ�ģ�͵�ԭ��ż��ʧ�ܡ�
 */
public class Singleton_Lazy_SynClass
{
	private static Singleton_Lazy_SynClass singleton = null;
	
	
	// ���Ʋ����������
	private Singleton_Lazy_SynClass()
	{

	}

	
	// ͨ���÷������ʵ�����󣬵�һ���п�Ϊ�˱��ⲻ��Ҫ��ͬ�����ڶ����п�Ϊ�˴���ʵ����
	public static Singleton_Lazy_SynClass getSingleton()
	{
		if(singleton == null)
		{
			synchronized (Singleton_Lazy_SynMethod.class)
			{
				if(singleton == null)
				{
					singleton = new Singleton_Lazy_SynClass();
				}
			}
		}
		
		return singleton;
	}


	
	// ��������������������static
	public static void doSomething()
	{

	}
	
	
}
