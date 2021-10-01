package dept;

import java.util.List;
import java.util.Scanner;

import javax.swing.text.html.parser.DTD;

public class DeptMain {

	public static void main(String[] args) {

		boolean run = true;
		Scanner sc = new Scanner(System.in);
		DeptDAO dao = new DeptDAO();

		while (run) {
			System.out.println("***********************");
			System.out.println("1. ��ü �μ� ��ȸ");
			System.out.println("2. Ư�� �μ� ��ȸ");
			System.out.println("3. �μ� �߰�");
			System.out.println("4. �μ� ����");
			System.out.println("5. �μ� ����");
			System.out.println("6. ����");
			System.out.println("***********************");

			System.out.print("���� >>");
			int menu = sc.nextInt();

			switch (menu) {
			case 1:
				List<DeptDTO> list = dao.getRows();

				System.out.println("�μ���ȣ\t�μ���\t����");
				for (DeptDTO dto : list) {
					System.out.print(dto.getDeptNo() + "\t");
					System.out.print(dto.getDname() + "\t");
					System.out.print(dto.getLoc() + "\t");
					System.out.println();
				}
				System.out.println();
				break;
			case 2:
				System.out.println("\n��ȸ �μ� �Է�>>");
				int deptno = sc.nextInt();
				DeptDTO dao1 =  dao.getrow(deptno);
				System.out.println("��ȸ ������ ������ �����ϴ�.");
				System.out.println("�μ���ȣ: "+dao1.getDeptNo());
				System.out.println("�μ���: "+dao1.getDname());
				System.out.println("����ġ: "+dao1.getLoc());
				System.out.println();
				break;
			case 3:
				System.out.println("�μ� �߰�");
				System.out.print("�μ���ȣ : ");
				int newdepNo = sc.nextInt();
				System.out.print("�μ��� : ");
				String newDname =  sc.next();
				System.out.print("�μ���ġ : ");
				String newLoc = sc.next();
				DeptDTO dto = new DeptDTO(newdepNo,newDname,newLoc);
				System.out.println(dao.insert(dto)?"�μ��Է� ����":"�μ��Է� ����");
				System.out.println();
				break;
			case 4:
				System.out.println("\n�μ� ����");
				System.out.print("\n���� �μ� ��ȣ : ");
				int updateDeptNo = sc.nextInt();
				System.out.print("���� �μ��� : ");
				String updateDname = sc.next();
				
				System.out.println(dao.updateSet(updateDname, updateDeptNo)?"�μ� ���� ����": "����");
				System.out.println();
				break;
			case 5:
				System.out.println("\n�μ� ����");
				System.out.print("\n���� �μ� ��ȣ : ");
				int removeNo = sc.nextInt();
				System.out.println(dao.deletex(removeNo)?"���� ����":"����");
				break;
			case 6:
				run = false;
				break;

			default:
				System.out.println("��ȣ�� Ȯ���� �ּ���.");
				break;
			}
		}

	}

}
