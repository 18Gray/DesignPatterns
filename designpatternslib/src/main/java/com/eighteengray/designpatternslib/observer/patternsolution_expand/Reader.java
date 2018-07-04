package com.eighteengray.designpatternslib.observer.patternsolution_expand;

import java.util.Observable;

/**
 * �����Ķ��ߣ�Ϊ�˼򵥾�����һ������
 */
public class Reader implements java.util.Observer{
	/**
	 * ���ߵ�����
	 */
	private String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void update(Observable o, Object obj) {
		//ͬʱ֧�� ��ģ�� �� ��ģ��
		
		//���ǲ����Ƶķ�ʽ
		System.out.println(name+"�յ���ֽ�ˣ��Ķ��ȡ�Ŀ���ƹ�����������==="+obj);
		//���ǻ�ȡ��������
		System.out.println(name+"�յ���ֽ�ˣ��Ķ��ȡ�������Ŀ�����ȥ����������==="
		+((NewsPaper)o).getContent());
	}
	
}
