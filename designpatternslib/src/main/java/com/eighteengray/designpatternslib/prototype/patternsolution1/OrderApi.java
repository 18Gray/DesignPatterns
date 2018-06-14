package com.eighteengray.designpatternslib.prototype.patternsolution1;


/**
 * �����Ľӿڣ������˿��Կ�¡����ķ���
 */
public interface OrderApi {
	/**
	 * ��ȡ������Ʒ����
	 * @return �����в�Ʒ����
	 */
	public int getOrderProductNum();
	/**
	 * ���ö�����Ʒ����
	 * @param num ������Ʒ����
	 */
	public void setOrderProductNum(int num);
	/**
	 * ��¡����
	 * @return ����ԭ�͵�ʵ��
	 */
	public OrderApi cloneOrder();
}
