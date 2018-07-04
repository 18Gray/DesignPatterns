package com.eighteengray.designpatternslib.observer.patternsolution1;

public class Client {
	public static void main(String[] args) {
		//����һ����ֽ����Ϊ���۲���
		NewsPaper subject = new NewsPaper();
		
		//�����Ķ��ߣ�Ҳ���ǹ۲���
		Reader reader1 = new Reader();
		reader1.setName("����");
		
		Reader reader2 = new Reader();
		reader2.setName("����");
		
		Reader reader3 = new Reader();
		reader3.setName("����");
		
		//ע���Ķ���
		subject.attach(reader1);
		subject.attach(reader2);
		subject.attach(reader3);
		
		//Ҫ����ֽ��
		subject.setContent("���������ǹ۲���ģʽ");
	}
}
