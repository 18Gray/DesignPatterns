package com.eighteengray.designpatternslib.facade.patternsolution;
/**
 * ʾ�����ù������Ǹ����ȡ�����ļ���
 * ���������ļ����������õ�����Model��ȥ���Ǹ�����
 */
public class ConfigManager {
	private static ConfigManager manager = null;
	private static ConfigModel cm = null;
	private ConfigManager(){
		
	}
	public static ConfigManager getInstance(){
		if(manager == null){
			manager = new ConfigManager();
			cm = new ConfigModel();
			//��ȡ�����ļ�����ֵ���õ�ConfigModel��ȥ
		}
		return manager;
	}
	/**
	 * ��ȡ���õ�����
	 * @return ���õ�����
	 */
	public ConfigModel getConfigData(){
		return cm;
	}
}
