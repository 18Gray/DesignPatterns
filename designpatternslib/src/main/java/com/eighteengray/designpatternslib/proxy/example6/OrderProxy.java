package com.eighteengray.designpatternslib.proxy.example6;

/**
 * �����Ĵ������
 */
public class OrderProxy extends Order{
	
	public OrderProxy(String productName,int orderNum,String orderUser){
		super(productName,orderNum,orderUser);
	}
	
	public void setProductName(String productName,String user) {
		//���Ʒ���Ȩ�ޣ�ֻ�д�����������Ա���ܹ��޸�
		if(user!=null && user.equals(this.getOrderUser())){
			super.setProductName(productName, user);
		}else{
			System.out.println("�Բ���"+user+"������Ȩ�޸Ķ����еĲ�Ʒ���ơ�");
		}
	}
	public void setOrderNum(int orderNum,String user) {
		//���Ʒ���Ȩ�ޣ�ֻ�д�����������Ա���ܹ��޸�
		if(user!=null && user.equals(this.getOrderUser())){
			super.setOrderNum(orderNum, user);
		}else{
			System.out.println("�Բ���"+user+"������Ȩ�޸Ķ����еĶ���������");
		}
	}
	public void setOrderUser(String orderUser,String user) {
		//���Ʒ���Ȩ�ޣ�ֻ�д�����������Ա���ܹ��޸�
		if(user!=null && user.equals(this.getOrderUser())){
			super.setOrderUser(orderUser, user);
		}else{
			System.out.println("�Բ���"+user+"������Ȩ�޸Ķ����еĶ����ˡ�");
		}
	}

	public String toString(){
		return "productName="+this.getProductName()+",orderNum="+this.getOrderNum()+",orderUser="+this.getOrderUser();
	}
}
