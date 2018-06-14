package com.eighteengray.designpatternslib.factorymethod.patternsolution_ioc;

public abstract class A1 {
	/**
	 * ��������������C1�������ڴ�����ע�������;��
	 * @return C1�Ķ���ʵ��
	 */
	protected abstract C1 createC1();
	public void t1(){
		//������Ҫʹ��C1�����ǲ�֪������������һ����Ҳ�Ͳ�����ȥ����C1�ˣ���ô�죿
		//����������������ʵ�֣�������ʡ�ģ����ﲻ�ù���ô��ȡC1��ֱ��ʹ�þͺ���
		createC1().tc();
	}
}
