package com.eighteengray.designpatternslib.proxy.example1;
import java.util.*;
import java.sql.*;

/**
 * ʵ��ʾ��Ҫ��Ĺ���
 */
public class UserManager {
	
	/**
	 * ���ݲ��ű������ȡ�ò����µ�������Ա
	 * @param depId ���ű��
	 * @return �ò����µ�������Ա
	 */
	public Collection<UserModel> getUserByDepId(String depId)throws Exception{
		Collection<UserModel> col = new ArrayList<UserModel>();
		Connection conn = null;
		try{
			conn = this.getConnection();
			String sql = "select * from tbl_user u,tbl_dep d "
				+"where u.depId=d.depId and d.depId like ?";

			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, depId+"%");
			
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()){
				UserModel um = new UserModel();
				um.setUserId(rs.getString("userId"));
				um.setName(rs.getString("name"));
				um.setDepId(rs.getString("depId"));
				um.setSex(rs.getString("sex"));
				
				col.add(um);
			}
			
			rs.close();
			pstmt.close();
		}finally{
			conn.close();
		}
		return col;
	}
	/**
	 * ��ȡ�����ݿ������
	 * @return ���ݿ�����
	 */
	private Connection getConnection() throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		return DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:orcl", "test", "test");
	}
}
