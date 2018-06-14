package com.eighteengray.designpatternslib.factorymethod.patternsolution;
/**
 * ����Ĵ�����ʵ�ֶ���ʵ�ִ����������ı��ļ���ʽ�Ķ���
 */
public class ExportTxtFileOperate extends ExportOperate{

	protected ExportFileApi factoryMethod() {
		//�����������ı��ļ���ʽ�Ķ���
		return new ExportTxtFile();
	}

}
