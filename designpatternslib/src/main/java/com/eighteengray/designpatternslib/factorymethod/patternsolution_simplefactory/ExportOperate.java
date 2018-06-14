package com.eighteengray.designpatternslib.factorymethod.patternsolution_simplefactory;
/**
 * ʵ�ֵ������ݵ�ҵ���ܶ���
 */
public class ExportOperate {
	/**
	 * �����ļ�
	 * @param type �û�ѡ��ĵ�������
	 * @param data ��Ҫ���������
	 * @return �Ƿ�ɹ������ļ�
	 */
	public boolean export(int type,String data){
		//ʹ�ù�������
		ExportFileApi api = MyFactory.factoryMethod(type);
		return api.export(data);
	}
	/**
	 * ���������������������ļ�����Ľӿڶ���
	 * @param type �û�ѡ��ĵ�������
	 * @return �������ļ�����Ľӿڶ���
	 */

}
