package com.eighteengray.designpatternslib.proxy.example3;
/**
 * �����û����ݵĶ���
 */
public class UserModel implements UserModelApi{	
	/**
	 * �û����
	 */
	private String userId;
	/**
	 * �û�����
	 */
	private String name;
	/**
	 * ���ű��
	 */
	private String depId;
	/**
	 * �Ա�
	 */
	private String sex;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepId() {
		return depId;
	}
	public void setDepId(String depId) {
		this.depId = depId;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	@Override
	public String toString(){
		return "userId="+userId+",name="+name+",depId="+depId+",sex="+sex+"\n";
	}
}
