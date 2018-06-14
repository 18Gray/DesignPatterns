package com.eighteengray.designpatternslib.builder.patternsolution1;
/**
 * ����������ݵĶ���
 */
public class ExportDataModel {
	/**
	 * ��Ʒ���
	 */
	private String productId;
	/**
	 * ���ۼ۸�
	 */
	private double price;
	/**
	 * ��������
	 */
	private double amount;
	
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
}
