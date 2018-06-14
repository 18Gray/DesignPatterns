package com.eighteengray.designpatternslib.proxy.example2;
/**
 * �������
 */
public class Proxy implements Subject{
	/**
	 * ���б�����ľ����Ŀ�����
	 */
	private RealSubject realSubject=null;
	/**
	 * ���췽�������뱻����ľ����Ŀ�����
	 * @param realSubject ������ľ����Ŀ�����
	 */
	public Proxy(RealSubject realSubject){
		this.realSubject = realSubject;
	}
	
	public void request() {
		//��ת�������Ŀ�����ǰ������ִ��һЩ���ܴ���
		
		//ת�������Ŀ�����ķ���
		realSubject.request();
		
		//��ת�������Ŀ�����󣬿���ִ��һЩ���ܴ���
	}

}
