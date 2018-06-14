package com.eighteengray.designpatternslib.adapter.patternsolution;

import java.io.*;

/**
 * ��־���ݶ���
 */
public class LogModel implements Serializable{
	/**
	 * ��־���
	 */
	private String logId;
	/**
	 * ������Ա
	 */
	private String operateUser;
	/**
	 * ����ʱ�䣬��yyyy-MM-dd HH:mm:ss�ĸ�ʽ��¼
	 */
	private String operateTime;	
	/**
	 * ��־����
	 */
	private String logContent;
	
	public String getLogId() {
		return logId;
	}
	public void setLogId(String logId) {
		this.logId = logId;
	}
	public String getOperateUser() {
		return operateUser;
	}
	public void setOperateUser(String operateUser) {
		this.operateUser = operateUser;
	}
	public String getOperateTime() {
		return operateTime;
	}
	public void setOperateTime(String operateTime) {
		this.operateTime = operateTime;
	}
	public String getLogContent() {
		return logContent;
	}
	public void setLogContent(String logContent) {
		this.logContent = logContent;
	}
	
	public String toString(){
		return "logId="+logId+",operateUser="+operateUser+",operateTime"+operateTime+",logContent="+logContent;
	}
}
