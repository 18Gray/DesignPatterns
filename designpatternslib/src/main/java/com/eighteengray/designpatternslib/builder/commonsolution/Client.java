package com.eighteengray.designpatternslib.builder.commonsolution;

import java.util.*;

public class Client {
	public static void main(String[] args) {
		//׼����������
		ExportHeaderModel ehm = new ExportHeaderModel();
		ehm.setDepId("һ�ֹ�˾");
		ehm.setExportDate("2012-06-26");
		
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
		ExportToTxt toTxt = new ExportToTxt();
		toTxt.export(ehm, mapData, efm);
		//���������xml�ļ�
		ExportToXml toXml = new ExportToXml();
		toXml.export(ehm, mapData, efm);
		
	}
}
