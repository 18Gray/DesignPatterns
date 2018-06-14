package com.eighteengray.designpatternslib.factorymethod.patternsolution;
/**
 * �������ı��ļ���ʽ�Ķ���
 */
public class ExportXmlFileOperate extends ExportOperate{

	@Override
	protected ExportFileApi factoryMethod() {
		return new ExportXmlFile();
	}	
}
