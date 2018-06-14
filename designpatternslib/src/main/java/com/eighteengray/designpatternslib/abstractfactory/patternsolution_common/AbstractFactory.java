package com.eighteengray.designpatternslib.abstractfactory.patternsolution_common;
/**
 * ���󹤳��Ľӿڣ��������������Ʒ����Ĳ���
 */
public interface AbstractFactory {
	/**
	 * ʾ�����������������ƷA�Ķ���
	 * @return �����ƷA�Ķ���
	 */
	public AbstractProductA createProductA();
	/**
	 * ʾ�����������������ƷB�Ķ���
	 * @return �����ƷB�Ķ���
	 */
	public AbstractProductB createProductB();
}