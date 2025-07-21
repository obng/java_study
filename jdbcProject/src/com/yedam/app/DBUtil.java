package com.yedam.app;

import java.sql.Connection;
import java.sql.DriverManager;

// DB 접속과 관련된 정보를 제어하는 부분
// ojdbc11.jar 외부 라이브러리를 추가함

public class DBUtil {
	// DB 접속 정보 활용 -> 세션 (Connection 객체)
	public static Connection getConnect() {
		// Connection 객체
		Connection conn = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
											   "scott", "tiger");
			
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
}
