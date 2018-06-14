package com.eighteengray.designpatternslib.prototype.commonsolution;
/**
 * ��ҵ��������
 */
public class EnterpriseOrder implements OrderApi{
	/**
	 * ��ҵ����
	 */
	private String enterpriseName;
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
	public String getEnterpriseName() {
		return enterpriseName;
	}
	public void setEnterpriseName(String enterpriseName) {
		this.enterpriseName = enterpriseName;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String toString(){
		return "����ҵ�����Ķ�����ҵ��="+this.enterpriseName+"��������Ʒ��="+this.productId+"����������Ϊ="+this.orderProductNum;
	}
}
