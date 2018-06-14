package com.eighteengray.designpatternslib.prototype.commonsolution;
/**
 * ���˶�������
 */
public class PersonalOrder implements OrderApi{
	/**
	 * ������Ա����
	 */
	private String customerName;
	/**
	 * ��Ʒ���
	 */
	private String productId;
	/**
	 * ������Ʒ����
	 */
	private int orderProductNum = 0;
	
	public int getOrderProductNum() {
		return this.orderProductNum;
	}	
	public void setOrderProductNum(int num) {
		this.orderProductNum = num;
	}	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String toString(){
		return "�����˶����Ķ�������="+this.customerName+"��������Ʒ��="+this.productId+"����������Ϊ="+this.orderProductNum;
	}
}
