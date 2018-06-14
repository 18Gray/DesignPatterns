package com.eighteengray.designpatternslib.singleton;



public class Singleton_Static_Inner
{
	private static final Singleton_Static_Inner singleton = null;
	
	
	// ���Ʋ����������
	private Singleton_Static_Inner()
	{
	}

	
	// ͨ���÷������ʵ������
	public static Singleton_Static_Inner getSingleton()
	{
		return SingletonHolder.singleton;
	}

	
	//��̬�ڲ���
	private static class SingletonHolder
	{
		private static final Singleton_Static_Inner singleton = new Singleton_Static_Inner();
	}
	
	
	
}
