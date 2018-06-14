package com.eighteengray.designpatternslib.factorymethod.patternsolution;
/**
 * ʵ�ֵ������ݵ�ҵ���ܶ���
 */
public abstract class ExportOperate {
	
	public ABC createABC(String name){
		return new ABC(name,factoryMethod());
	}
	
	/**
	 * �����ļ�
	 * @param data ��Ҫ���������
	 * @return �Ƿ�ɹ������ļ�
	 */
	public boolean export(String data){
		//����ɸ��ֵ�������ǰ��׼������
		//�����������У��
		System.out.println("now ��������У��");
		//�����������ת��
		System.out.println("now ��������ת��");
		//����������ݸ�ʽ�ķ�װ
		System.out.println("now �������ݸ�ʽ�ķ�װ");
		
		//Ȼ���������ȥ����
		
		//ʹ�ù�������
		ExportFileApi api = factoryMethod();
		
		return api.export(data);
	}
	/**
	 * ���������������������ļ�����Ľӿڶ���
	 * @return �������ļ�����Ľӿڶ���
	 */
	protected abstract ExportFileApi factoryMethod();
	
	//��ҪԼ���������Ϊ����ҪΪ�����ṩ�����Ĺ���
}
