package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Select {

	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement pstmt = null;
		ResultSet rSet = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "c##scott";
			String password = "tiger";

			connection = DriverManager.getConnection(url, user, password);
			if (connection != null) {
				System.out.println("연결되었습니다.");

				// sql 구문을 작성 => emp 테이블의 모든 데이터 조회
				String sql = "SELECT * FROM emp";

				// sql 구문을 데이터베이스 서버로 전송
				pstmt = connection.prepareStatement(sql);

				// sql 구문이 실행된 결과를 받아오기
				rSet = pstmt.executeQuery();

				// 받아온 결과를 화면에 출력하는 작업
				System.out.println("empno   ename    job     mgr       hiredate             sal        comm       deptno");
				while (rSet.next()) { // ResultSet 객체 안에 읽어올 내용이 있으면 true
					System.out.print(rSet.getInt("empno") + "\t");
					System.out.print(rSet.getString("ename") + "\t");
					System.out.print(rSet.getString("job") + "\t");
					System.out.print(rSet.getInt("mgr") + "\t");
					System.out.print(rSet.getDate("hiredate") + "\t");
					System.out.print(rSet.getInt("sal") + "\t");
					System.out.print(rSet.getInt("comm") + "\t");
					System.out.println(rSet.getInt("deptno") + "\t");
				}

			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

}
