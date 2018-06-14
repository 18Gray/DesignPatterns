package com.eighteengray.designpatternslib.builder.commonsolution;
import java.util.*;
/**
 * �������ݵ��ı��ļ��Ķ���
 */
public class ExportToTxt {
	/**
	 * �������ݵ��ı��ļ�
	 * @param ehm �ļ�ͷ������
	 * @param mapData ���ݵ�����
	 * @param efm �ļ�β������
	 */
	public void export(ExportHeaderModel ehm,Map<String,Collection<ExportDataModel>> mapData,ExportFooterModel efm){
		//������¼����������ļ�����
		StringBuffer buffer = new StringBuffer();
		//1������ƴ���ļ�ͷ������
		buffer.append(ehm.getDepId()+","+ehm.getExportDate()+"\n");
		//2��������ƴ���ļ��������
		for(String tblName : mapData.keySet()){
			//��ƴ�ӱ�����
			buffer.append(tblName+"\n");
			//Ȼ��ѭ��ƴ�Ӿ�������
			for(ExportDataModel edm : mapData.get(tblName)){
				buffer.append(edm.getProductId()+","+edm.getPrice()+","+edm.getAmount()+"\n");
			}
		}
		//3��������ƴ���ļ�β������
		buffer.append(efm.getExportUser());
		
		//Ϊ����ʾ����ԣ�����Ͳ�ȥд����ļ��Ĵ�����
		//��Ҫ������������������̨����
		System.out.println("������ı��ļ������ݣ�\n"+buffer);
	}
}
