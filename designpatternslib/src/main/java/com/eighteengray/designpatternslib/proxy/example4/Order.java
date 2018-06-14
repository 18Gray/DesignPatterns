package com.eighteengray.designpatternslib.proxy.example4;
/**
 * ��������
 */
public class Order implements OrderApi{
	/**
	 * ���������Ĳ�Ʒ����
	 */
	private String productName;
	/**
	 * ��������������
	 */
	private int orderNum;
	/**
	 * ������������Ա
	 */
	private String orderUser;
	
	/**
	 * ���췽�������빹����Ҫ������
	 * @param productName ���������Ĳ�Ʒ����
	 * @param orderNum ��������������
	 * @param orderUser ������������Ա
	 */
	public Order(String productName,int orderNum,String orderUser){
		this.productName = productName;
		this.orderNum = orderNum;
		this.orderUser = orderUser;
	}
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName,String user) {
		this.productName = productName;
	}
	public int getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(int orderNum,String user) {
		this.orderNum = orderNum;
	}
	public String getOrderUser() {
		return orderUser;
	}
	public void setOrderUser(String orderUser,String user) {
		this.orderUser = orderUser;
	}
}
