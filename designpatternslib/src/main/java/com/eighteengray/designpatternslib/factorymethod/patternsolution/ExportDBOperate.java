package com.eighteengray.designpatternslib.factorymethod.patternsolution;
/**
 * ����Ĵ�����ʵ�ֶ���ʵ�ִ������������ݿⱸ���ļ���ʽ�Ķ���
 */
public class ExportDBOperate extends ExportOperate{
	protected ExportFileApi factoryMethod() {
		//�������������ݿⱸ���ļ���ʽ�Ķ���
		return new ExportDB();
	}
}
