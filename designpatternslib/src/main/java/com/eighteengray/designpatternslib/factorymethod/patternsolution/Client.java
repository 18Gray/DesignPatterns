package com.eighteengray.designpatternslib.factorymethod.patternsolution;

public class Client {
	public static void main(String[] args) {
//		//������Ҫʹ�õ�Creator����
		ExportOperate operate = new ExportXmlFileOperate();
//		//����������ݵĹ��ܷ���
		operate.export("��������");
		
//		ABC abc = new ExportOperate().createABC("cc");
		
//		abc.test();
	}
}
