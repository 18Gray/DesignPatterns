package com.eighteengray.designpatternslib.abstractfactory.patternsolution_dao;

public class BusinessObject {
	public static void main(String[] args) {
		//����DAO�ĳ��󹤳�
		DAOFactory df = new XmlDAOFactory();
		//ͨ�����󹤳�����ȡ��Ҫ��DAO�ӿ�
		OrderMainDAO mainDAO = df.createOrderMainDAO();
		OrderDetailDAO detailDAO = df.createOrderDetailDAO();
		//����DAO��������ݴ洢�Ĺ���
		mainDAO.saveOrderMain();
		detailDAO.saveOrderDetail();
	}
}
