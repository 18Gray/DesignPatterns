package com.eighteengray.designpatternslib.builder.commonsolution;

import java.util.Collection;
import java.util.Map;
/**
 * �������ݵ�XML�ļ��Ķ���
 */
public class ExportToXml {
	/**
	 * �������ݵ�XML�ļ�
	 * @param ehm �ļ�ͷ������
	 * @param mapData ���ݵ�����
	 * @param efm �ļ�β������
	 */
	public void export(ExportHeaderModel ehm,Map<String,Collection<ExportDataModel>> mapData,ExportFooterModel efm){
		//������¼����������ļ�����
		StringBuffer buffer = new StringBuffer();
		//1������ƴ���ļ�ͷ������
		buffer.append("<?xml version='1.0' encoding='gb2312'?>\n");
		buffer.append("<Report>\n");
		buffer.append("  <Header>\n");
		buffer.append("    <DepId>"+ehm.getDepId()+"</DepId>\n");
		buffer.append("    <ExportDate>"+ehm.getExportDate()+"</ExportDate>\n");
		buffer.append("  </Header>\n");
		//2��������ƴ���ļ��������
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
		//3��������ƴ���ļ�β������
		buffer.append("  <Footer>\n");
		buffer.append("    <ExportUser>"+efm.getExportUser()+"</ExportUser>\n");
		buffer.append("  </Footer>\n");
		buffer.append("</Report>\n");
		
		//Ϊ����ʾ����ԣ�����Ͳ�ȥд����ļ��Ĵ�����
		//��Ҫ������������������̨����
		System.out.println("�����XML�ļ������ݣ�\n"+buffer);
	}
}
