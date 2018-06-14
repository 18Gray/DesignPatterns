package com.eighteengray.designpatternslib.builder.patternsolution1;

import java.util.Collection;
import java.util.Map;

/**
 * ʵ�ֵ������ݵ��ı��ļ��ĵĹ���������
 */
public class TxtBuilder implements Builder {
	/**
	 * ������¼�������ļ������ݣ��൱�ڲ�Ʒ
	 */
	private StringBuffer buffer = new StringBuffer();
	public void buildBody(
			Map<String, Collection<ExportDataModel>> mapData) {
		for(String tblName : mapData.keySet()){
			//��ƴ�ӱ�����
			buffer.append(tblName+"\n");
			//Ȼ��ѭ��ƴ�Ӿ�������
			for(ExportDataModel edm : mapData.get(tblName)){
				buffer.append(edm.getProductId()+","+edm.getPrice()+","+edm.getAmount()+"\n");
			}
		}
	}
	public void buildFooter(ExportFooterModel efm) {
		buffer.append(efm.getExportUser());
	}
	public void buildHeader(ExportHeaderModel ehm) {
		buffer.append(ehm.getDepId()+","+ehm.getExportDate()+"\n");
	}	
	public StringBuffer getResult(){
		return buffer;
	}	
}