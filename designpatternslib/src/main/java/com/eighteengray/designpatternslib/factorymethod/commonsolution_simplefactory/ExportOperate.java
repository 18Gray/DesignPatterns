package com.eighteengray.designpatternslib.factorymethod.commonsolution_simplefactory;
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
		//����ɸ��ֵ�������ǰ��׼������
		//�����������У��
		System.out.println("now ��������У��");
		//�����������ת��
		System.out.println("now ��������ת��");
		//����������ݸ�ʽ�ķ�װ
		System.out.println("now �������ݸ�ʽ�ķ�װ");
		
		//Ȼ���������ȥ����
		ExportFileApi api = null;
		//����������ѡ�񾿾�Ҫ������һ�ֵ����ļ�����
		if(type == 1){
			api = new ExportTxtFile();
		}else if(type == 2){
			api = new ExportDB();
		}else if(type==3){
			api = new ExportXmlFile();
		}
		return api.export(data);
	}
}
