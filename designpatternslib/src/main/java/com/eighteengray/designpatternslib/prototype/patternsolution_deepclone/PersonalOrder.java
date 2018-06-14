package com.eighteengray.designpatternslib.prototype.patternsolution_deepclone;
/**
 * ���˶�������
 */
public class PersonalOrder implements Cloneable , OrderApi{
	/**
	 * ������Ա����
	 */
	private String customerName;
	/**
	 * ��Ʒ����
	 */
	private Product product = null;
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
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	
	public String toString(){
		//�򵥵����
		return "������Ʒ��="+this.product.getName()+"����������Ϊ="+this.orderProductNum;
	}
	
	public Object clone(){
		PersonalOrder obj=null;
		try {
			obj =(PersonalOrder)super.clone();
			//��һ�仰������
			obj.setProduct((Product)this.product.clone());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}		
		return obj;
	}

}
