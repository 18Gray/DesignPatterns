package com.eighteengray.designpatternslib.prototype.patternsolution1;

public class OrderClient {
	public static void main(String[] args) {
		//����������������Ϊ����ʾ�򵥣�ֱ��new��
		PersonalOrder op = new PersonalOrder();
		//���ö�������
		op.setOrderProductNum(1925);
		op.setCustomerName("����");
		op.setProductId("P0001");
		
		//�����ȡҵ������࣬Ҳֱ��new�ˣ�Ϊ�˼򵥣���ҵ��ӿڶ�û����
		OrderBusiness ob = new OrderBusiness();
		//����ҵ�������涩������
		ob.saveOrder(op);
	}
}