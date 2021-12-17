package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx8 {

	public static void main(String[] args) {
		List<Student> stuList = new ArrayList<>();
		stuList.add(new Student("ȫ�浿", 40));
		stuList.add(new Student("���¿�", 90));
		stuList.add(new Student("������", 50));
		stuList.add(new Student("����ȣ", 80));
		
		//�� student ��ü �ȿ� �ִ� ������ ����Ʈ ���·� �����ޱ�
		List<Integer> list = new ArrayList<Integer>();
//		for(Student s:stuList) {
//			list.add(s.getJumsu());
//		}
		List<Integer> intList = stuList.stream().map(Student::getJumsu).collect(Collectors.toList());
		System.out.println(intList);
		
	}

}
