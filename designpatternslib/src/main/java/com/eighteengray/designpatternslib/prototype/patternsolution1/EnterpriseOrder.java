package com.eighteengray.designpatternslib.prototype.patternsolution1;
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
	public OrderApi cloneOrder() {
		//����һ���µĶ�����Ȼ��ѱ�ʵ�������ݸ��ƹ�ȥ
		EnterpriseOrder order = new EnterpriseOrder();
		order.setEnterpriseName(this.enterpriseName);
		order.setProductId(this.productId);
		order.setOrderProductNum(this.orderProductNum);
		
		return order;
	}
	
}
