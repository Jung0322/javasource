package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {

	public static void main(String[] args) {
		Connection con = null;
		try {
			// 드라이버 로드
			Class.forName("oracle.jdbc.OracleDriver");

			// 연결 시도
			// localhost : 본인 컴퓨터
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "c##scott";
			String password = "tiger";
			con = DriverManager.getConnection(url, user, password);
			if (con != null)
				System.out.println("연결되었습니다.");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
