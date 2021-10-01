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
				System.out.println("����Ǿ����ϴ�.");

				// sql ������ �ۼ� => emp ���̺��� ��� ������ ��ȸ
				String sql = "SELECT * FROM emp";

				// sql ������ �����ͺ��̽� ������ ����
				pstmt = connection.prepareStatement(sql);

				// sql ������ ����� ����� �޾ƿ���
				rSet = pstmt.executeQuery();

				// �޾ƿ� ����� ȭ�鿡 ����ϴ� �۾�
				System.out.println("empno   ename    job     mgr       hiredate             sal        comm       deptno");
				while (rSet.next()) { // ResultSet ��ü �ȿ� �о�� ������ ������ true
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
