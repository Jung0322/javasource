package dept;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DeptDAO {
	// empDAO static, Connection

	static {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "c##scott";
		String password = "tiger";
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}

	// 부서정보 전체 가져오기 select * from dept_temp;
	public List<DeptDTO> getRows() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<DeptDTO> list = new ArrayList<DeptDTO>();
		try {
			con = getConnection();
			String sql = "select * from dept_temp";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				DeptDTO dto = new DeptDTO();
				dto.setDeptNo(rs.getInt("deptno"));
				dto.setDname(rs.getString("dname"));
				dto.setLoc(rs.getString("loc"));
				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				con.close();
			} catch (Exception e2) {

			}
		}
		return list;
	}

	// 특정 부서정보 가져오기 select * from dept_temp where deptno = ?;
	public DeptDTO getrow(int deptno) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		DeptDTO dto = null;
		try {
			String sql = "select * from dept_temp where deptno = ?";
			con = getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, deptno);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				dto = new DeptDTO();
				dto.setDeptNo(rs.getInt(1));
				dto.setDname(rs.getString(2));
				dto.setLoc(rs.getString(3));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return dto;
	}

	public boolean insert(DeptDTO dto) {
		boolean flag = false;

		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = getConnection();
			String sql = "insert into dept_temp(deptno,dname,loc) values(?,?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, dto.getDeptNo());
			pstmt.setString(2, dto.getDname());
			pstmt.setString(3, dto.getLoc());
			int result = pstmt.executeUpdate();
			if (result > 0) {
				flag = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {

			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return flag;
	}

	// 부서명을 변경하는 작업 update dept_temp set dname=? where deptno=?
	public boolean updateSet(String dname, int deptNo) {

		Connection con = null;
		PreparedStatement pstmt = null;
		boolean updateflag = false;

		try {
			con = getConnection();
			String sql = "update dept_temp set dname=? where deptNo=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dname);
			pstmt.setInt(2, deptNo);

			int result = pstmt.executeUpdate();
			if (result > 0) {
				updateflag = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				con.close();

			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return updateflag;

	}

	public boolean deletex(int deptNo) {
		Connection con = null;
		PreparedStatement pstmt = null;
		boolean deleteflag = false;
		try {
			con = getConnection();
			String sql = "delete from dept_temp where deptno=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, deptNo);
			int result = pstmt.executeUpdate();
			if (result > 0) {
				deleteflag = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return deleteflag;
	}

}
