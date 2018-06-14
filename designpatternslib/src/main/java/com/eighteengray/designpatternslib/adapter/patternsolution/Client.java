package com.eighteengray.designpatternslib.adapter.patternsolution;
import java.util.*;
public class Client {
	public static void main(String[] args) {
		//׼����־���ݣ�Ҳ���ǲ��Ե�����
		LogModel lm1 = new LogModel();
		lm1.setLogId("001");
		lm1.setOperateUser("admin");
		lm1.setOperateTime("2010-03-02 10:08:18");
		lm1.setLogContent("����һ������");
		
		List<LogModel> list = new ArrayList<LogModel>();
		list.add(lm1);

		//����������־�ļ��Ķ���
		LogFileOperateApi logFileApi = new LogFileOperate("");
		
		//�����°�Ĳ�����־�Ľӿڶ���
		LogDbOperateApi api = new MyAdapter(logFileApi,new TimeUtil()); 
		
//		LogDbOperateApi api = null;
		
		
		/////////////////////////�����Ĳ���
		//������־�ļ�
		api.createLog(lm1);
		
		//��ȡ��־�ļ�������
		List<LogModel> allLog = api.getAllLog();
		System.out.println("allLog44="+allLog);
	}
}
