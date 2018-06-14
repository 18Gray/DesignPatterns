package com.eighteengray.designpatternslib.mediator.patternsolution2;

import java.util.*;
/**
 * ʵ�ֲ��ź���Ա�������н���ʵ����
 * ˵����Ϊ����ʾ�ļ���ԣ�ֻʾ��ʵ�ֳ������ź���Ա��ְ�Ĺ���
 */
public class DepUserMediatorImpl{
	private static DepUserMediatorImpl mediator = new DepUserMediatorImpl();
	private DepUserMediatorImpl(){
		//���ó�ʼ���������ݵĹ���
		initTestData();
	}
	public static DepUserMediatorImpl getInstance(){
		return mediator;
	}
	
	/**
	 * �����ã���¼���ź���Ա�Ĺ�ϵ
	 */
	private Collection<DepUserModel> depUserCol = new ArrayList<DepUserModel>();
	/**
	 * ��ʼ����������
	 */
	private void initTestData(){
		//׼��һЩ��������
		DepUserModel du1 = new DepUserModel();
		du1.setDepUserId("du1");
		du1.setDepId("d1");
		du1.setUserId("u1");		
		depUserCol.add(du1);
		
		DepUserModel du2 = new DepUserModel();
		du2.setDepUserId("du2");
		du2.setDepId("d1");
		du2.setUserId("u2");		
		depUserCol.add(du2);
		
		DepUserModel du3 = new DepUserModel();
		du3.setDepUserId("du3");
		du3.setDepId("d2");
		du3.setUserId("u3");		
		depUserCol.add(du3);
		
		DepUserModel du4 = new DepUserModel();
		du4.setDepUserId("du4");
		du4.setDepId("d2");
		du4.setUserId("u4");		
		depUserCol.add(du4);
		
		DepUserModel du5 = new DepUserModel();
		du5.setDepUserId("du5");
		du5.setDepId("d2");
		du5.setUserId("u1");		
		depUserCol.add(du5);
	}
	/**
	 * ����������ŵĲ��������������Ա�Ľ�������Ҫȥ����Ӧ�Ĺ�ϵ
	 * @param depId �������Ĳ��Ŷ���ı��
	 * @return �Ƿ��Ѿ���ȷ�Ĵ������������������������Ա�Ľ���
	 */
	public boolean deleteDep(String depId) {
		//��ע�⣺Ϊ����ʾ�򵥣����ų�����ԭ���ŵ���Ա��ô����Ⱥ���ҵ��������Ͳ�����
		
		//1������¼���ź���Ա��ϵ�ļ������棬Ѱ�Ҹ����������ص���Ա
		//����һ����ʱ�ļ��ϣ���¼��Ҫ����Ĺ�ϵ����
		Collection<DepUserModel> tempCol = new ArrayList<DepUserModel>();
		for(DepUserModel du : depUserCol){
			if(du.getDepId().equals(depId)){
				//2����Ҫ�������صļ�¼ȥ�����ȼ�¼����
				tempCol.add(du);
			}
		}
		//3���ӹ�ϵ���������������Щ��ϵ
		depUserCol.removeAll(tempCol);
		
		return true;
	}
	/**
	 * �������Ա��ְ������벿�ŵĽ���
	 * @param userId ��ְ����Ա�ı��
	 * @return �Ƿ���ȷ����������Ա��ְ������벿�ŵĽ���
	 */
	public boolean deleteUser(String userId) {
		//1������¼���ź���Ա��ϵ�ļ������棬Ѱ�Ҹ������Ա��صĲ���
		//����һ����ʱ�ļ��ϣ���¼��Ҫ����Ĺ�ϵ����
		Collection<DepUserModel> tempCol = new ArrayList<DepUserModel>();
		for(DepUserModel du : depUserCol){
			if(du.getUserId().equals(userId)){
				//2����Ҫ�������صļ�¼ȥ�����ȼ�¼����
				tempCol.add(du);
			}
		}
		//3���ӹ�ϵ���������������Щ��ϵ
		depUserCol.removeAll(tempCol);
	
		return true;
	}
	/**
	 * �����ã����ڲ���ӡ��ʾһ��һ�������µ�������Ա
	 * @param dep ���Ŷ���
	 */
	public void showDepUsers(Dep dep) {
		for(DepUserModel du : depUserCol){
			if(du.getDepId().equals(dep.getDepId())){
				System.out.println("���ű��="+dep.getDepId()+"����ӵ����Ա�������ǣ�"+du.getUserId());
			}
		}
	}
	/**
	 * �����ã����ڲ���ӡ��ʾһ��һ����Ա�����Ĳ���
	 * @param user ��Ա����
	 */
	public void showUserDeps(User user) {
		for(DepUserModel du : depUserCol){
			if(du.getUserId().equals(user.getUserId())){
				System.out.println("��Ա���="+user.getUserId()+"���ڲ��ű���ǣ�"+du.getDepId());
			}
		}
	}
	/**
	 * �������Ա��������������벿�ŵĽ���
	 * @param userId ����������Ա�ı��
	 * @param oldDepId ����ǰ�Ĳ��ŵı��
	 * @param newDepId ������Ĳ��ŵı��
	 * @return �Ƿ���ȷ����������Ա��������������벿�ŵĽ���
	 */
	public boolean changeDep(String userId,String oldDepId, String newDepId) {
		//��ʾ����ȥʵ����
		return false;
	}
	

	/**
	 * ������źϲ����������������Ա�Ľ���
	 * @param colDepIds ��Ҫ�ϲ��Ĳ��ŵı�ż���
	 * @param newDep �ϲ����µĲ��Ŷ���
	 * @return �Ƿ���ȷ���������źϲ����������������Ա�Ľ���
	 */
	public boolean joinDep(Collection<String> colDepIds, Dep newDep) {
		//��ʾ����ȥʵ����		
		return false;
	}
}
