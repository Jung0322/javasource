package lambda;

import java.util.ArrayList;
import java.util.List;

public class FromCollectionEx2 {

	public static void main(String[] args) {
		List<Student> stuList = new ArrayList<>();
		stuList.add(new Student("ȫ�浿", 40));
		stuList.add(new Student("���¿�", 90));
		stuList.add(new Student("������", 50));
		stuList.add(new Student("����ȣ", 80));
		
		stuList.stream().forEach(stu -> System.out.println(stu.getName()+", "+stu.getJumsu()));

	}

}
