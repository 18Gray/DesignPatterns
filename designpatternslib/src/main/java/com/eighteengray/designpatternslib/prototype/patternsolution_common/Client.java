package com.eighteengray.designpatternslib.prototype.patternsolution_common;
/**
 * ʹ��ԭ�͵Ŀͻ���
 */
public class Client {
	/**
	 * ������Ҫʹ�õ�ԭ�ͽӿڶ���
	 */
	private Prototype prototype;
	/**
	 * ���췽����������Ҫʹ�õ�ԭ�ͽӿڶ���
	 * @param prototype ��Ҫʹ�õ�ԭ�ͽӿڶ���
	 */
	public Client(Prototype prototype){
		this.prototype = prototype;
	}
	/**
	 * ʾ�ⷽ����ִ��ĳ�����ܲ���
	 */
	public void operation(){
		//����Ҫ����ԭ�ͽӿڵĶ���
		Prototype newPrototype = prototype.clone();
	}
}