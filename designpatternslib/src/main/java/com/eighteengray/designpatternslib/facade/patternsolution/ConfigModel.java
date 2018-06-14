package com.eighteengray.designpatternslib.facade.patternsolution;
/**
 * ʾ����������������Model����ʵ���������ݻ�ܶ�
 */
public class ConfigModel {
	/**
	 * �Ƿ���Ҫ���ɱ��ֲ㣬Ĭ����true
	 */
	private boolean needGenPresentation = true;
	/**
	 * �Ƿ���Ҫ�����߼��㣬Ĭ����true
	 */
	private boolean needGenBusiness = true;
	/**
	 * �Ƿ���Ҫ����DAO��Ĭ����true
	 */
	private boolean needGenDAO = true;
	public boolean isNeedGenPresentation() {
		return needGenPresentation;
	}
	public void setNeedGenPresentation(boolean needGenPresentation) {
		this.needGenPresentation = needGenPresentation;
	}
	public boolean isNeedGenBusiness() {
		return needGenBusiness;
	}
	public void setNeedGenBusiness(boolean needGenBusiness) {
		this.needGenBusiness = needGenBusiness;
	}
	public boolean isNeedGenDAO() {
		return needGenDAO;
	}
	public void setNeedGenDAO(boolean needGenDAO) {
		this.needGenDAO = needGenDAO;
	}
}
