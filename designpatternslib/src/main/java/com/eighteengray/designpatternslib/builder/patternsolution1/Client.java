package com.eighteengray.designpatternslib.builder.patternsolution1;

import java.util.*;

public class Client {
	public static void main(String[] args) {
		//׼����������
		ExportHeaderModel ehm = new ExportHeaderModel();
		ehm.setDepId("һ�ֹ�˾");
		ehm.setExportDate("2010-05-18");
		
		Map<String,Collection<ExportDataModel>> mapData = new HashMap<String,Collection<ExportDataModel>>();
		Collection<ExportDataModel> col = new ArrayList<ExportDataModel>();
		
		ExportDataModel edm1 = new ExportDataModel();
		edm1.setProductId("��Ʒ001��");
		edm1.setPrice(100);
		edm1.setAmount(80);
		
		ExportDataModel edm2 = new ExportDataModel();
		edm2.setProductId("��Ʒ002��");
		edm2.setPrice(99);
		edm2.setAmount(55);		
		//��������װ����
		col.add(edm1);
		col.add(edm2);		
		mapData.put("���ۼ�¼��", col);
		
		ExportFooterModel efm = new ExportFooterModel();
		efm.setExportUser("����");
		
		//����������ı��ļ�
		TxtBuilder txtBuilder = new TxtBuilder();
		//����ָ���߶���
		Director director = new Director(txtBuilder);
		
		director.construct(ehm, mapData, efm);
		//��Ҫ������������������̨����
		System.out.println("������ı��ļ������ݣ�\n"+txtBuilder.getResult());
		
		
		//���������xml�ļ�
		XmlBuilder xmlBuilder = new XmlBuilder();
		
//		Director director2 = new Director(xmlBuilder);
//		director2.construct(ehm, mapData, efm);
		
		xmlBuilder.buildHeader(ehm);
		xmlBuilder.buildBody(mapData);
		xmlBuilder.buildFooter(efm);
		
		//��Ҫ������������������̨����
		System.out.println("�����XML�ļ������ݣ�\n"+xmlBuilder.getResult());
		
	}
}
