package com.eighteengray.designpatternslib.builder.commonsolution;
/**
 * ����������ļ�ͷ�����ݵĶ���
 */
public class ExportHeaderModel {
	/**
	 * �ֹ�˾�����е���
	 */
	private String depId;
	/**
	 * �������ݵ�����
	 */
	private String exportDate;
	public String getDepId() {
		return depId;
	}
	public void setDepId(String depId) {
		this.depId = depId;
	}
	public String getExportDate() {
		return exportDate;
	}
	public void setExportDate(String exportDate) {
		this.exportDate = exportDate;
	}
}
