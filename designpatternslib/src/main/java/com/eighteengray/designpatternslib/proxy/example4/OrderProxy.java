package com.eighteengray.designpatternslib.proxy.example4;

/**
 * �����Ĵ������
 */
public class OrderProxy implements OrderApi{
	/**
	 * ���б�����ľ����Ŀ�����
	 */
	private Order order=null;
	/**
	 * ���췽�������뱻����ľ����Ŀ�����
	 * @param realSubject ������ľ����Ŀ�����
	 */
	public OrderProxy(Order realSubject){
		this.order = realSubject;
	}
	public void setProductName(String productName,String user) {
		//���Ʒ���Ȩ�ޣ�ֻ�д�����������Ա���ܹ��޸�
		if(user!=null && user.equals(this.getOrderUser())){
			order.setProductName(productName, user);
		}else{
			System.out.println("�Բ���"+user+"������Ȩ�޸Ķ����еĲ�Ʒ���ơ�");
		}
	}
	public void setOrderNum(int orderNum,String user) {
		//���Ʒ���Ȩ�ޣ�ֻ�д�����������Ա���ܹ��޸�
		if(user!=null && user.equals(this.getOrderUser())){
			order.setOrderNum(orderNum, user);
		}else{
			System.out.println("�Բ���"+user+"������Ȩ�޸Ķ����еĶ���������");
		}
	}
	public void setOrderUser(String orderUser,String user) {
		//���Ʒ���Ȩ�ޣ�ֻ�д�����������Ա���ܹ��޸�
		if(user!=null && user.equals(this.getOrderUser())){
			order.setOrderUser(orderUser, user);
		}else{
			System.out.println("�Բ���"+user+"������Ȩ�޸Ķ����еĶ����ˡ�");
		}
	}
	public int getOrderNum() {
		return this.order.getOrderNum();
	}
	public String getOrderUser() {
		return this.order.getOrderUser();
	}
	public String getProductName() {
		return this.order.getProductName();
	}
	public String toString(){
		return "productName="+this.getProductName()+",orderNum="+this.getOrderNum()+",orderUser="+this.getOrderUser();
	}
}
