package com.eighteengray.designpatternslib.prototype.commonsolution;
/**
 * 个人订单对象
 */
public class PersonalOrder implements OrderApi{
	/**
	 * 订购人员姓名
	 */
	private String customerName;
	/**
	 * 产品编号
	 */
	private String productId;
	/**
	 * 订单产品数量
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
		return "本个人订单的订购人是="+this.customerName+"，订购产品是="+this.productId+"，订购数量为="+this.orderProductNum;
	}
}
