package emp;

import java.util.List;
import java.util.Scanner;

public class EmpMain {
	public static void main(String[] args) {

		boolean run = true;
		Scanner sc = new Scanner(System.in);
		EmpDAO dao = new EmpDAO();

		while (run) {
			System.out.println("=========================================");
			System.out.println("1. 개별 조회");
			System.out.println("2. 전체 조회");
			System.out.println("3. 급여 오름차순 조회");
			System.out.println("4. 급여 수정");
			System.out.println("5. 추가 수당 수정");
			System.out.println("6. 신입사원 입력");
			System.out.println("7. 사원 삭제");
			System.out.println("8. 종료");
			System.out.println("=========================================");

			System.out.print("입력 >> ");
			int no = sc.nextInt();

			switch (no) {
			case 1:
				System.out.print("조회할 사원번호 입력 : ");
				int empno = sc.nextInt();
				EmpDTO dto = dao.getRow(empno);

				if (dto == null) {
					System.out.println("\n데이터 없음");
				} else {
					System.out.println("\n사번\t이름\t직무\t매니저\t입사일\t\t급여\t보너스\t부서번호");
					System.out.print(dto.getEmpno() + "\t");
					System.out.print(dto.getEname() + "\t");
					System.out.print(dto.getJob() + "\t");
					System.out.print(dto.getMgr() + "\t");
					System.out.print(dto.getHiredate() + "\t");
					System.out.print(dto.getSal() + "\t");
					System.out.print(dto.getComm() + "\t");
					System.out.println(dto.getDeptno() + "\n");
				}
				break;
			case 2:
				List<EmpDTO> list = dao.select();

				System.out.println("\n사번\t이름\t직무\t매니저\t입사일\t\t급여\t보너스\t부서번호");
				for (EmpDTO dto1 : list) {
					System.out.print(dto1.getEmpno() + "\t");
					System.out.print(dto1.getEname() + "\t");
					System.out.print(dto1.getJob() + "\t");
					System.out.print(dto1.getMgr() + "\t");
					System.out.print(dto1.getHiredate() + "\t");
					System.out.print(dto1.getSal() + "\t");
					System.out.print(dto1.getComm() + "\t");
					System.out.print(dto1.getDeptno() + "\n");
				}
				break;
			case 3:
				List<EmpDTO> list1 = dao.orderBySal();
				System.out.println("사원별 급여 오름차순 조회ㅊ");
				System.out.println("\n이름\t급여");
				for (EmpDTO dto1 : list1) {
					System.out.print(dto1.getEname() + "\t");
					System.out.print(dto1.getSal() + "\n");
				}
				System.out.println();
				break;
			case 4:
				System.out.print("\n수정 사원 번호:");
				empno = sc.nextInt();
				System.out.println("수정 급여 : ");
				int sal = sc.nextInt();
				Boolean updateFlag = dao.updateSal(empno, sal);
				System.out.println(updateFlag ? "업데이트 성공" : "업데이터 실패");
				System.out.println();
				break;
			case 5:
				System.out.print("\n조건 급여:");
				sal = sc.nextInt();
				System.out.println("추가수당 : ");
				int comm = sc.nextInt();
				updateFlag = dao.updateComm(comm, sal);
				System.out.println(updateFlag ? "업데이트 성공" : "업데이터 실패");
				System.out.println();
				break;
			case 6:
				System.out.println("***신입사원 입력***");
				
				System.out.print("사원 번호: ");
				empno = sc.nextInt();
				System.out.print("사원명 : ");
				String ename = sc.next();
				System.out.print("직무");
				String job = sc.next();
				System.out.print("매니저 번호 : ");
				int mgr = sc.nextInt();
				System.out.print("급여 : ");
				sal =  sc.nextInt();
				System.out.print("추가수당 : ");
				comm = sc.nextInt();
				System.out.print("부사번호 : ");
				int deptno = sc.nextInt();
				
				EmpDTO newDto = new EmpDTO(empno, ename, job, mgr, null, sal, comm, deptno);
				
				System.out.println(dao.insertEmp(newDto)?"사원 추가 성공":"사원 추가 실패");
				break;
			case 7:
				System.out.println("***사원 삭제***");
				System.out.print("삭제할 사원 번호 : ");
				empno = sc.nextInt();
				System.out.println(dao.deleteEmp(empno)?"사원 삭제 성공":"사원 삭제 실패");
				System.out.println();
				break;
			case 8:
				run = false;
				break;
			default:
				System.out.println("번호를 확인해 주세요");
				break;
			}

		}

	}
}
