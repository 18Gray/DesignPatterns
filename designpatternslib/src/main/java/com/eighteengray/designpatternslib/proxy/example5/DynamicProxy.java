package com.eighteengray.designpatternslib.proxy.example5;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
/**
 * ʹ��Java�еĶ�̬����
 */
public class DynamicProxy implements InvocationHandler{
	/**
	 * ������Ķ���
	 */
	private OrderApi order = null;
	/**
	 * ��ȡ�󶨺ô���;���Ŀ�������Ŀ�����Ľӿ�
	 * @param order ����Ķ��������൱�ھ���Ŀ�����
	 * @return �󶨺ô���;���Ŀ�������Ŀ�����Ľӿ�
	 */
	public OrderApi getProxyInterface(Order order){
		//���ñ�����Ķ��󣬺÷���invoke����Ĳ���
		this.order = order;
		//�������Ķ�������Ͷ�̬�����������
		OrderApi orderApi = (OrderApi) Proxy.newProxyInstance(
				order.getClass().getClassLoader(),
				order.getClass().getInterfaces(), 
				this);
		return orderApi;
	}
	
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		//����ǵ���setter��������Ҫ���Ȩ��
		if(method.getName().startsWith("set")){
			//������Ǵ����ˣ��ǾͲ����޸�
			if(order.getOrderUser()!=null && order.getOrderUser().equals(args[1])){
				//���Բ���
				return method.invoke(order, args);
			}else{
				System.out.println("�Բ���"+args[1]+"������Ȩ�޸ı������е�����");
			}
		}else{
			//���ǵ��õ�setter�����ͼ�������
			return method.invoke(order, args);
		}
		return null;
	}
}
