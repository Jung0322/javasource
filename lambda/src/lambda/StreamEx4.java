package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class StreamEx4 {

	public static void main(String[] args) {
		List<Student> stuList = new ArrayList<>();
		stuList.add(new Student("È«±æµ¿", 40));
		stuList.add(new Student("±èÅÂ¿ì", 90));
		stuList.add(new Student("¼ÛÁ¾±¹", 50));
		stuList.add(new Student("±èÀ±È£", 80));
		
		//±è¾¾ ¼ºÀ» °¡Áø »ç¶÷À» Ãâ·Â
		for(Student stu:stuList) {
			if(stu.getName().startsWith("±è")) {
				System.out.println(stu.getName());
			}
		}
		
		stuList.stream()
			   .filter(s ->s.getName().startsWith("±è"))
			   .forEach(name -> System.out.println(name.getName()));
		
		// map + filter + foreach
		stuList.stream()
			   .map(stu -> stu.getName())
			   .filter(s ->s.startsWith("±è"))
			   .forEach(System.out::println);
		
		IntStream intStream = IntStream.range(1, 10);
		//Â¦¼ö¸¸ Ãâ·Â
		intStream.filter(s -> s%2==0).forEach(System.out::println);
	
	}
	
	

}
