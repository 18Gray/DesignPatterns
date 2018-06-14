package com.eighteengray.designpatternslib.abstractfactory.patternsolution1;

public class Client {
	public static void main(String[] args) {
		//����װ������ʦ����
		ComputerEngineer engineer = new ComputerEngineer();
		//�ͻ�ѡ�񲢴�����Ҫʹ�õ�װ����������
		AbstractFactory schema = new Schema2();
		//����װ������ʦ�Լ�ѡ���װ����������װ������ʦ��װ����
		engineer.makeComputer(schema);
	}
}
