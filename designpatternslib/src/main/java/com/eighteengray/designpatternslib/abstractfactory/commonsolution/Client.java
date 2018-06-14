package com.eighteengray.designpatternslib.abstractfactory.commonsolution;

public class Client {
	public static void main(String[] args) {
		//����װ������ʦ����
		ComputerEngineer engineer = new ComputerEngineer();
		//����װ������ʦ�Լ�ѡ����������װ������ʦ��װ����
		engineer.makeComputer(1,2);
	}
}
