package com.eighteengray.designpatternslib.mediator.patternsolution1;

public class Client {
	public static void main(String[] args) {
		//1�������н��ߡ����������
		MotherBoard mediator = new MotherBoard();
		//2������ͬ����
		CDDriver cd = new CDDriver(mediator);
		CPU cpu = new CPU(mediator);
		VideoCard vc = new VideoCard(mediator);
		SoundCard sc = new SoundCard(mediator);
		//3�����н���֪�����е�ͬ��
		mediator.setCdDriver(cd);
		mediator.setCpu(cpu);
		mediator.setVideoCard(vc);
		mediator.setSoundCard(sc);
		
		//4����ʼ����Ӱ���ѹ��̷��������������ʼ����
		cd.readCD();
	}
}