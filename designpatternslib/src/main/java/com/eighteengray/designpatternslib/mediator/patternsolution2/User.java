package com.eighteengray.designpatternslib.mediator.patternsolution2;

/**
 * ��Ա��
 */
public class User{
	/**
	 * ��Ա���
	 */
	private String userId;
	/**
	 * ��Ա����
	 */
	private String userName;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * ��Ա��ְ
	 * @return �Ƿ���ɹ�
	 */
	public boolean dimission(){
		//1��Ҫ��ͨ���н���ȥ����������������Ա��صĲ��ź���Ա�Ĺ�ϵ
		DepUserMediatorImpl mediator = DepUserMediatorImpl.getInstance();
		mediator.deleteUser(userId);
		//2��Ȼ������������������Ա
		//��ע�⣬ʵ�ʿ����У���Ա��ְ���ǲ������ɾ����Ա��¼�ģ�
		//ͨ���ǰ���Ա��¼��״̬������ɾ��������ó���ɾ����
		//ֻ�ǲ��ٲμ��µ�ҵ�񣬵����Ѿ�������ҵ���¼�ǲ��ᱻ�������
		
		return true;
	}
}
