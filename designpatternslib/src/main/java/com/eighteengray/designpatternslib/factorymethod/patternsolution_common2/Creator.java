package com.eighteengray.designpatternslib.factorymethod.patternsolution_common2;
/**
 * �ͻ���ʹ��Creator�������ͻ�����Ҫ�Ķ��������£�Creator�Ļ���ʵ�ֽṹ
 */
public abstract class Creator {
	/**
	 * ����������һ�㲻���⣬����һ����������
	 * @return �����Ĳ�Ʒ����һ������һ����Ʒ����Ĳ���
	 */
	protected abstract Product1 factoryMethod1();
	/**
	 * ����������һ�㲻���⣬����һ����������
	 * @return �����Ĳ�Ʒ����һ������һ����Ʒ����Ĳ���
	 */
	protected abstract Product2 factoryMethod2();
	/**
	 * �����ͻ�����Ҫ�Ķ��󣬿ͻ�����Ҫʹ�ò�Ʒ�������������Ҫ�Ĺ���
	 * @return �ͻ�����Ҫ�Ķ���
	 */
	public Product createProduct(){
		//������ʹ�ù����������õ��ͻ����������Ĳ�������
		Product1 p1 = factoryMethod1();
		Product2 p2 = factoryMethod2();
		//�������������Ķ����Ǵ����ͻ��˶�������Ҫ��
		Product p = new ConcreteProduct();
		p.setProduct1(p1);
		p.setProduct2(p2);
		
		return p;
	}
}
