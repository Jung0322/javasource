package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx8 {

	public static void main(String[] args) {
		List<Student> stuList = new ArrayList<>();
		stuList.add(new Student("홍길동", 40));
		stuList.add(new Student("김태우", 90));
		stuList.add(new Student("송종국", 50));
		stuList.add(new Student("김윤호", 80));
		
		//각 student 객체 안에 있는 점수만 리스트 형태로 돌려받기
		List<Integer> list = new ArrayList<Integer>();
//		for(Student s:stuList) {
//			list.add(s.getJumsu());
//		}
		List<Integer> intList = stuList.stream().map(Student::getJumsu).collect(Collectors.toList());
		System.out.println(intList);
		
	}

}
