package com.eighteengray.designpatternslib.factorymethod.patternsolution_simplefactory;
/**
 * ������xml�ļ��Ķ���
 */
public class ExportXml implements ExportFileApi{
	public boolean export(String data) {
		//��ʾ��һ��
		System.out.println("��������"+data+"��XML�ļ�");
		return true;
	}
}
