package com.eighteengray.designpatternslib.observer.patternsolution_common;

import java.util.*;
/**
 * Ŀ�������֪���۲����Ĺ۲��ߣ����ṩע���ɾ���۲��ߵĽӿ�
 */
public class Subject {
	/**
	 * ��������ע��Ĺ۲��߶���
	 */
	private List<Observer> observers = new ArrayList<Observer>();
	/**
	 * ע��۲��߶���
	 * @param observer �۲��߶���
	 */
	public void attach(Observer observer) {
		observers.add(observer);
	}
	/**
	 * ɾ���۲��߶���
	 * @param observer �۲��߶���
	 */
	public void detach(Observer observer) {
		observers.remove(observer);
	}
	/**
	 * ֪ͨ����ע��Ĺ۲��߶���
	 */
	protected void notifyObservers() {
		for(Observer observer : observers){
			observer.update(this);
		}
	}
}

