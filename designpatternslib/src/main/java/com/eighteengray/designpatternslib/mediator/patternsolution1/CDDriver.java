package com.eighteengray.designpatternslib.mediator.patternsolution1;
/**
 * �����࣬һ��ͬ����
 */
public class CDDriver extends Colleague{
	public CDDriver(Mediator mediator) {
		super(mediator);
	}
	/**
	 * ������ȡ����������
	 */
	private String data = "";
	/**
	 * ��ȡ������ȡ����������
	 * @return ������ȡ����������
	 */
	public String getData(){
		return this.data;
	}
	/**
	 * ��ȡ����
	 */
	public void readCD(){
		//����ǰ����Ƶ��ʾ�����ݣ����ź�������
		this.data = "���ģʽ,ֵ�úú��о�";
		//֪ͨ���壬�Լ���״̬�����˸ı�
		this.getMediator().changed(this);
	}
}
