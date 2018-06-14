package com.eighteengray.designpatternslib.adapter.patternsolution;
import java.util.*;
/**
 * ���������־��Ӧ�ýӿڣ�Ϊ��ʾ���ļ򵥣�
 * ֻ�Ǽ򵥵Ķ�������ɾ�Ĳ�ķ���
 */
public interface LogDbOperateApi {
	/**
	 * ������־
	 * @param lm ��Ҫ��������־����
	 */
	public void createLog(LogModel lm);
	/**
	 * �޸���־
	 * @param lm ��Ҫ�޸ĵ���־����
	 */
	public void updateLog(LogModel lm);
	/**
	 * ɾ����־
	 * @param lm ��Ҫɾ������־����
	 */
	public void removeLog(LogModel lm);
	/**
	 * ��ȡ���е���־
	 * @return ���е���־����
	 */
	public List<LogModel> getAllLog();
}
