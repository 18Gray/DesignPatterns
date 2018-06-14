package com.eighteengray.designpatternslib.singleton;


public class Singleton_Badmash
{
	private static final Singleton_Badmash singleton = new Singleton_Badmash();
	
	
	// ���Ʋ����������
	private Singleton_Badmash()
	{

	}

	
	// ͨ���÷������ʵ������
	public static Singleton_Badmash getSingleton()
	{
		return singleton;
	}


	
	// ��������������������static
	public static void doSomething()
	{

	}
	
	
}
