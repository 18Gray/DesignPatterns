package com.eighteengray.designpatternslib.adapter.commonsolution;

import java.util.ArrayList;
import java.util.List;

public class Client
{
	public static void main(String[] args)
	{
		// ׼����־���ݣ�Ҳ���ǲ��Ե�����
		LogModel lm1 = new LogModel();
		lm1.setLogId("001");
		lm1.setOperateUser("admin");
		lm1.setOperateTime("2010-03-02 10:08:18");
		lm1.setLogContent("����һ������");

		List<LogModel> list = new ArrayList<LogModel>();
		list.add(lm1);

		// ����������־�ļ��Ķ���
		LogFileOperateApi api = new LogFileOperate("");
		// ������־�ļ�
		api.writeLogFile(list);

		// ��ȡ��־�ļ�������
		List<LogModel> readLog = api.readLogFile();
		System.out.println("readLog=" + readLog);
	}
}
