package com.eighteengray.designpatternslib.adapter.patternsolution;

import java.util.List;

/**
 * ���������󣬰Ѽ�¼��־���ļ��Ĺ�������ɵڶ�����Ҫ����ɾ�Ĳ�Ĺ���
 */
public class Adapter  implements LogDbOperateApi{
	//����ʹ�ö�����ϣ�������ʹ�ö���̳�
	
	/**
	 * ������Ҫ������Ľӿڶ���
	 */
	private LogFileOperateApi adaptee;
	
	private TimeUtil adaptee2 = null;
	/**
	 * ���췽����������Ҫ������Ķ���
	 * @param adaptee ��Ҫ������Ķ���
	 */
	public Adapter(LogFileOperateApi adaptee,TimeUtil times) {
		this.adaptee = adaptee;
		this.adaptee2 = times;
	}
	
	public void createLog(LogModel lm) {
		this.adaptee2.begin();
		//1���ȶ�ȡ�ļ�������
		List<LogModel> list = adaptee.readLogFile();
		//2�������µ���־����
		list.add(lm);
		//3������д���ļ�
		adaptee.writeLogFile(list);
		this.adaptee2.end();
		this.adaptee2.show();
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

	public void updateLog(LogModel lm) {
		//1���ȶ�ȡ�ļ�������
		List<LogModel> list = adaptee.readLogFile();
		//2���޸���Ӧ����־����
		for(int i=0;i<list.size();i++){
			if(list.get(i).getLogId().equals(lm.getLogId())){
				list.set(i, lm);
				break;
			}
		}
		//3������д���ļ�
		adaptee.writeLogFile(list);
	}
}
