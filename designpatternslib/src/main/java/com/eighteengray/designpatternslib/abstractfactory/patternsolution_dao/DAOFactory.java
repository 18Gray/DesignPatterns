package com.eighteengray.designpatternslib.abstractfactory.patternsolution_dao;
/**
 * ���󹤳����������������Ӽ�¼��Ӧ��DAO����
 */
public abstract class DAOFactory {
	/**
	 * ������������¼��Ӧ��DAO����
	 * @return ��������¼��Ӧ��DAO����
	 */
	public abstract OrderMainDAO createOrderMainDAO();
	/**
	 * ���������Ӽ�¼��Ӧ��DAO����
	 * @return �����Ӽ�¼��Ӧ��DAO����
	 */
	public abstract OrderDetailDAO createOrderDetailDAO();
}
