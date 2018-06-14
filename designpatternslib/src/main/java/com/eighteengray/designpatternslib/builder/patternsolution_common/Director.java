package com.eighteengray.designpatternslib.builder.patternsolution_common;
/**
 * ָ���ߣ�ָ��ʹ�ù������Ľӿ���������Ʒ�Ķ���
 */
public class Director {
	/**
	 * ���е�ǰ��Ҫʹ�õĹ���������
	 */
	private Builder builder;
	/**
	 * ���췽�������빹��������
	 * @param builder ����������
	 */
	public Director(Builder builder) {
		this.builder = builder;
	}
	/**
	 * ʾ�ⷽ����ָ���������������յĲ�Ʒ����
	 */
	public void construct() {
		//ͨ��ʹ�ù������ӿ����������յĲ�Ʒ����
		builder.buildPart();
	}
}