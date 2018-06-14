package com.eighteengray.designpatternslib.prototype.patternsolution_deepclone;

public class Client {
	public static void main(String[] args) {
		//�ȴ���ԭ��ʵ��
		PersonalOrder oa1 = new PersonalOrder();
		
		//����ԭ��ʵ����ֵ
		Product product = new Product();
		product.setName("��Ʒ1");
		oa1.setProduct(product);
		oa1.setOrderProductNum(101);
		
	    System.out.println("���ǵ�һ�λ�ȡ�Ķ���ʵ��="+oa1);
	    
		//ͨ����¡����ȡ�µ�ʵ��
	    PersonalOrder oa2 = (PersonalOrder)oa1.clone();
		//�޸�����ֵ
	    oa2.getProduct().setName("��Ʒ2");
		oa2.setOrderProductNum(81);
		//�����¡�����Ķ����ֵ
		System.out.println("�����¡������ʵ��="+oa2);
		
		//�ٴ����ԭ��ʵ����ֵ
		System.out.println("�ٴ����ԭ��ʵ��="+oa1);	
	}
}
