package com.eighteengray.designpatternslib.builder.patternsolution1;

import java.util.Collection;
import java.util.Map;

/**
 * ʵ�ֵ������ݵ�XML�ļ��ĵĹ���������
 */
public class XmlBuilder implements Builder {
	/**
	 * ������¼�������ļ������ݣ��൱�ڲ�Ʒ
	 */
	private StringBuffer buffer = new StringBuffer();
	public void buildBody(
			Map<String, Collection<ExportDataModel>> mapData) {
		buffer.append("  <Body>\n");
		for(String tblName : mapData.keySet()){
			//��ƴ�ӱ�����
			buffer.append("    <Datas TableName=\""+tblName+"\">\n");
			//Ȼ��ѭ��ƴ�Ӿ�������
			for(ExportDataModel edm : mapData.get(tblName)){
				buffer.append("      <Data>\n");
				buffer.append("        <ProductId>"+edm.getProductId()+"</ProductId>\n");
				buffer.append("        <Price>"+edm.getPrice()+"</Price>\n");
				buffer.append("        <Amount>"+edm.getAmount()+"</Amount>\n");
				buffer.append("      </Data>\n");
			}
			buffer.append("    </Datas>\n");
		}
		buffer.append("  </Body>\n");
	}

	public void buildFooter(ExportFooterModel efm) {
		//����Ĵ�������
		
		//�������Լ����������󣬶���ʹ��������������Ķ���
		//���磺�򵥹�������������
		MyFooter mf = FooterFactory.createMyFooter();
		
		//�����װ����
		buffer.append(mf.genHeader(efm));
	}

	public void buildHeader(ExportHeaderModel ehm) {
		buffer.append("<?xml version='1.0' encoding='gb2312'?>\n");
		buffer.append("<Report>\n");
		buffer.append("  <Header>\n");
		buffer.append("    <DepId>"+ehm.getDepId()+"</DepId>\n");
		buffer.append("    <ExportDate>"+ehm.getExportDate()+"</ExportDate>\n");
		buffer.append("  </Header>\n");
	}
	public StringBuffer getResult(){
		return buffer;
	}
	
}