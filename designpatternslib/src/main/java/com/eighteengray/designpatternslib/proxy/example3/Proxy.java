package com.eighteengray.designpatternslib.proxy.example3;

import java.sql.*;
import java.util.*;

/**
 * �������,�����û����ݶ���
 */
public class Proxy implements UserModelApi{
	/**
	 * ���б�����ľ����Ŀ�����
	 */
	private UserModel realSubject=null;
	/**
	 * ���췽�������뱻����ľ����Ŀ�����
	 * @param realSubject ������ľ����Ŀ�����
	 */
	public Proxy(UserModel realSubject){
		this.realSubject = realSubject;
	}
	/**
	 * ��ʾ�Ƿ��Ѿ�����װ�ع�������
	 */
	private boolean loaded = false;
	
	
	public String getUserId() {
		return realSubject.getUserId();
	}
	public void setUserId(String userId) {
		realSubject.setUserId(userId);
	}
	public String getName() {
		return realSubject.getName();
	}
	public void setName(String name) {
		realSubject.setName(name);
	}
	
	
	public void setDepId(String depId) {
		realSubject.setDepId(depId);
	}
	public void setSex(String sex) {
		realSubject.setSex(sex);
	}
	
	public String getDepId() {
		//��Ҫ�ж��Ƿ��Ѿ�װ�ع���
		if(!this.loaded){
			//�����ݿ�������װ��
			reload();
			//��������װ�صı�־Ϊtrue
			this.loaded = true;
		}
		return realSubject.getDepId();
	}	
	public String getSex() {
		if(!this.loaded){
			reload();
			this.loaded = true;
		}
		return realSubject.getSex();
	}
	
	/**
	 * ���²�ѯ���ݿ��Ի�ȡ�������û�����
	 */
	private void reload(){
		System.out.println("���²�ѯ���ݿ��ȡ�������û����ݣ�userId=="+realSubject.getUserId());
		Connection conn = null;
		try{
			conn = this.getConnection();
			String sql = "select * from tbl_user where userId=? ";

			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, realSubject.getUserId());
			
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()){
				//ֻ��Ҫ���»�ȡ����userId��name�������
				realSubject.setDepId(rs.getString("depId"));
				realSubject.setSex(rs.getString("sex"));
			}
			
			rs.close();
			pstmt.close();
		}catch(Exception err){
			err.printStackTrace();
		}finally{
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	public String toString(){
		return "userId="+getUserId()+",name="+getName()
		+",depId="+getDepId()+",sex="+getSex()+"\n";
	}

	private Connection getConnection() throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		return DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:orcl", "test", "test");
	}
}
