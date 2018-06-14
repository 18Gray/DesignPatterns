package com.eighteengray.designpatternslib.mediator.patternsolution2;
/**
 *	�������ź���Ա��ϵ����
 */
public class DepUserModel {
	/**
	 * ���ڲ��ź���Ա��ϵ�ı�ţ���������
	 */
	private String depUserId;
	/**
	 * ���ŵı��
	 */
	private String depId;
	/**
	 * ��Ա�ı��
	 */
	private String userId;
	public String getDepUserId() {
		return depUserId;
	}
	public void setDepUserId(String depUserId) {
		this.depUserId = depUserId;
	}
	public String getDepId() {
		return depId;
	}
	public void setDepId(String depId) {
		this.depId = depId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
}
