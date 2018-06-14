package com.eighteengray.designpatternslib.facade.patternsolution;
/**
 * ʾ���������ݲ��ģ��
 */
public class DAO {
	public DAO(int a){
		
	}
	public void generate(){
		//1�������ù��������ȡ��Ӧ��������Ϣ
		ConfigModel cm = ConfigManager.getInstance().getConfigData();
		if(cm.isNeedGenDAO()){
			//2������Ҫ��ȥ������Ӧ�Ĵ��룬��������ļ�
			System.out.println("�����������ݲ�����ļ�");
		}
	}
}