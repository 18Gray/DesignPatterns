package com.eighteengray.designpatternslib.observer.patternsolution1;

import java.util.ArrayList;
import java.util.List;

/**
 * Ŀ�������Ϊ���۲���
 */
public class Subject {
	/**
	 * ��������ע��Ĺ۲��߶���Ҳ���Ǳ�ֽ�Ķ�����
	 */
	private List<Observer> readers = new ArrayList<Observer>();
	/**
	 * ��ֽ�Ķ�����Ҫ�����綩�ģ���Ҫע��
	 * @param reader ��ֽ�Ķ��� 
	 * @return �Ƿ�ע��ɹ�
	 */
	public void attach(Observer reader) {
		readers.add(reader);
	}
	/**
	 * ��ֽ�Ķ��߿���ȡ������
	 * @param reader ��ֽ�Ķ���
	 * @return �Ƿ�ȡ���ɹ�
	 */
	public void detach(Observer reader) {
		readers.remove(reader);
	}
	/**
	 * ��ÿ�ڱ�ֽӡˢ�����󣬾�ҪѸ�ٵ������ı��͵����ߵ����У�
	 * �൱��֪ͨ���ߣ�������֪��
	 */
	protected void notifyObservers() {
		for(Observer reader : readers){
			reader.update(this);
		}
	}
}
