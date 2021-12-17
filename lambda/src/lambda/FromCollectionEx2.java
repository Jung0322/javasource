package lambda;

import java.util.ArrayList;
import java.util.List;

public class FromCollectionEx2 {

	public static void main(String[] args) {
		List<Student> stuList = new ArrayList<>();
		stuList.add(new Student("È«±æµ¿", 40));
		stuList.add(new Student("±èÅÂ¿ì", 90));
		stuList.add(new Student("¼ÛÁ¾±¹", 50));
		stuList.add(new Student("±èÀ±È£", 80));
		
		stuList.stream().forEach(stu -> System.out.println(stu.getName()+", "+stu.getJumsu()));

	}

}
