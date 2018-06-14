package com.eighteengray.designpatternslib.builder.patternsolution1;

import java.util.Collection;
import java.util.Map;

/**
 * �������ӿڣ����崴��һ������ļ���������ĸ��������Ĳ���
 */
public interface Builder {
	/**
	 * ��������ļ���Header����
	 * @param ehm �ļ�ͷ������
	 */
	public void buildHeader(ExportHeaderModel ehm);
	/**
	 * ��������ļ���Body����
	 * @param mapData Ҫ��������ݵ�����
	 */
	public void buildBody(Map<String, Collection<ExportDataModel>> mapData);
	/**
	 * ��������ļ���Footer����
	 * @param efm �ļ�β������
	 */
	public void buildFooter(ExportFooterModel efm);
}