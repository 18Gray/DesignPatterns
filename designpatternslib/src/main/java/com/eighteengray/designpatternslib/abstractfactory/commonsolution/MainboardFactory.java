package com.eighteengray.designpatternslib.abstractfactory.commonsolution;
/**
 * ��������ļ򵥹���
 */
public class MainboardFactory {
	/**
	 * ��������ӿڶ���ķ���
	 * @param type ѡ���������͵Ĳ���
	 * @return ����ӿڶ���ķ���
	 */
	public static MainboardApi createMainboardApi(int type){
		MainboardApi mainboard = null;
		//���ݲ�����ѡ�񲢴�����Ӧ���������
		if(type==1){
			mainboard = new GAMainboard(1156);
		}else if(type==2){
			mainboard = new MSIMainboard(939);
		}
		return mainboard;
	}
}
