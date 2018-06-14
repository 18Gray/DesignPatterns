package com.eighteengray.designpatternslib.adapter.patternsolution;

import java.util.List;

public class MyAdapter extends DefaultAdapter{
	/**
	 * ������Ҫ������Ľӿڶ���
	 */
	private LogFileOperateApi adaptee;
	
	private TimeUtil adaptee2 = null;
	/**
	 * ���췽����������Ҫ������Ķ���
	 * @param adaptee ��Ҫ������Ķ���
	 */
	public MyAdapter(LogFileOperateApi adaptee,TimeUtil times) {
		this.adaptee = adaptee;
		this.adaptee2 = times;
	}
	


	public List<LogModel> getAllLog() {
		return adaptee.readLogFile();
	}

	public void removeLog(LogModel lm) {
		//1���ȶ�ȡ�ļ�������
		List<LogModel> list = adaptee.readLogFile();
		//2��ɾ����Ӧ����־����
		list.remove(lm);
		//3������д���ļ�
		adaptee.writeLogFile(list);
	}

	
}
