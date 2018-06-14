package com.eighteengray.designpatternslib.facade.patternsolution_expand;
/**
 * ����������ϵͳ����۶���
 */
public class Facade implements FacadeApi{
	/**
	 * �ͻ�����Ҫ�ģ�һ���򵥵ĵ��ô������ɵĹ���
	 */
	public  void generate(){
		new Presentation().generate();
		new Business().generate();
		new DAO(2).generate();
	}
}
