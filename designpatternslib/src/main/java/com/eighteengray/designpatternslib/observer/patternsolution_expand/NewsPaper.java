package com.eighteengray.designpatternslib.observer.patternsolution_expand;
import java.util.*;
/**
 * ��ֽ���󣬾����Ŀ��ʵ��
 */
public class NewsPaper extends Observable{
	/**
	 * ��ֽ�ľ�������
	 */
	private String content;
	/**
	 * ��ȡ��ֽ�ľ�������
	 * @return ��ֽ�ľ�������
	 */
	public String getContent() {
		return content;
	}
	/**
	 * ʾ�⣬���ñ�ֽ�ľ������ݣ��൱��Ҫ���汨ֽ��
	 * @param content ��ֽ�ľ�������
	 */
	public void setContent(String content) {
		this.content = content;
		//�������ˣ�˵���ֳ���ֽ�ˣ��Ǿ�֪ͨ���еĶ���
		//ע������Java�е�Observerģʽ��ʱ����仰������
		this.setChanged();
		//Ȼ������֪ͨ�������õ����Ƶķ�ʽ
//		this.notifyObservers(this.content);
		//��������ķ�ʽ����ô����
		this.notifyObservers();
	}
}
