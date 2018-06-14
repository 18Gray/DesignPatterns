package com.eighteengray.designpatternslib.factorymethod.patternsolution_simplefactory;

public class MyFactory {
	private MyFactory(){
		
	}
	public static ExportFileApi factoryMethod(int type){
		ExportFileApi api = null;
		//����������ѡ�񾿾�Ҫ������һ�ֵ����ļ�����
		if(type==1){
			api = new ExportTxtFile();
		}else if(type==2){
			api = new ExportDB();
		}
		return api;
	}
}
