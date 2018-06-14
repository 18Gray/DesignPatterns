package com.eighteengray.designpatternslib.mediator.patternsolution2;

import java.util.ArrayList;
import java.util.Collection;
/**
 * ������
 */
public class Dep{
	/**
	 * �������ű��
	 */
	private String depId;
	/**
	 * ������������
	 */
	private String depName;
	public String getDepId() {
		return depId;
	}
	public void setDepId(String depId) {
		this.depId = depId;
	}
	public String getDepName() {
		return depName;
	}
	public void setDepName(String depName) {
		this.depName = depName;
	}
	/**
	 * ��������
	 * @return �Ƿ����ɹ�
	 */
	public boolean deleteDep(){
		//1��Ҫ��ͨ���н���ȥ��������������������صĲ��ź���Ա�Ĺ�ϵ
		DepUserMediatorImpl mediator = DepUserMediatorImpl.getInstance();
		mediator.deleteDep(depId);
		//2��Ȼ��������������������
		//��ע����ʵ�ʿ����У���Щҵ���ܿ��ܻ�����ҵ���ȥ��
		//����ʵ�ʿ����ж����Ѿ�ʹ�õ�ҵ������ͨ���ǲ��ᱻɾ���ģ�
		//���ǻᱻ��Ϊ��ʷ���ݱ���
		
		return true;
	}
}
