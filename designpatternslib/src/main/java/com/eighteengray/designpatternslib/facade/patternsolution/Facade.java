package com.eighteengray.designpatternslib.facade.patternsolution;
/**
 * ����������ϵͳ����۶���
 */
public class Facade {
	private Facade(){
		
	}
	/**
	 * �ͻ�����Ҫ�ģ�һ���򵥵ĵ��ô������ɵĹ���
	 */
	public static void generate(){
		new Presentation().generate();
		new Business().generate();
		new DAO(2).generate();
	}
}
