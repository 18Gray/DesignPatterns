package com.eighteengray.designpatternslib.proxy.example5;

import java.lang.reflect.Proxy;

public class Client {
	public static void main(String[] args) {
		//�����ȵ�¼ϵͳ������һ������
		Order order = new Order("���ģʽ",100,"����");
		
		//����һ����̬����
		DynamicProxy dynamicProxy = new DynamicProxy();		
		//Ȼ��Ѷ����Ͷ�̬�����������
		OrderApi orderApi = dynamicProxy.getProxyInterface(order);
		
		//���¾���Ҫʹ�ñ�������Ľӿ���������
		//������Ҫ���޸ģ��Ǿͻᱨ��
		orderApi.setOrderNum(123, "����");
		//���order
		System.out.println("�����޸ĺ󶩵���¼û�б仯��"+orderApi);
		//�����޸ľͲ���������
		orderApi.setOrderNum(123, "����");
		//�ٴ����order
		System.out.println("�����޸ĺ󣬶�����¼��"+orderApi);
		
	}
}
