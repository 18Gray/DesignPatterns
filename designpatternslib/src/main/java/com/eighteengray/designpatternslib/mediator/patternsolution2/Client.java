package com.eighteengray.designpatternslib.mediator.patternsolution2;

public class Client {
	public static void main(String[] args) {
		DepUserMediatorImpl mediator = DepUserMediatorImpl.getInstance();
		//׼��Ҫ�����Ĳ��ţ�������Ҫһ�����ű��
		Dep dep = new Dep();
		dep.setDepId("d1");
		Dep dep2 = new Dep();
		dep2.setDepId("d2");
		//׼�����ڲ��Ե���Ա��Ҳֻ��Ҫһ����Ա���
		User user = new User();
		user.setUserId("u1");
		
		//���Գ������ţ�������֮ǰ�����һ�£��������Ա������Щ����		
		System.out.println("��������ǰ------------------");
		mediator.showUserDeps(user);
		
		//����ִ��ҵ�񣬳����������
		dep.deleteDep();
		
		//�ٴ����һ�£��������Ա������Щ����
		System.out.println("�������ź�------------------");
		mediator.showUserDeps(user);
		
		//������Ա��ְ��������֮ǰ�����һ�£�����������¶�����Щ��Ա
		System.out.println("---------------------------------");
		System.out.println("��Ա��ְǰ------------------");
		mediator.showDepUsers(dep2);
		
		//����ִ��ҵ����Ա��ְ
		user.dimission();
		
		//�ٴ����һ�£�����������¶�����Щ��Ա
		System.out.println("��Ա��ְ��------------------");
		mediator.showDepUsers(dep2);
	}
}
