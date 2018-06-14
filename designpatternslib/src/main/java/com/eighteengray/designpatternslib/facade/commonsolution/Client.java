package com.eighteengray.designpatternslib.facade.commonsolution;

public class Client
{
	public static void main(String[] args)
	{
		// ����û�������ļ�����ֱ��ʹ��Ĭ�ϵ�����
		// ͨ������£����㶼Ӧ�����ɣ�Ҳ����˵�ͻ��˱���
		// ����Щģ�鶼���˽⣬���ܹ���ȷʹ������

		new Presentation().generate();

		new Business().generate();

		new DAO().generate();
	}
}