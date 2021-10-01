package collection;

import java.util.ArrayList;
import java.util.Comparator;

public class ListEx2 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		list.add("java");
		list.add("JDBC");
		list.add("Servlet");
		list.add("jsp");
		list.add("java");
		
		System.out.println(list);
		
		list.add(2,"oracle");
		
		System.out.println(list);
		
		System.out.println();
		
		//삭제
		list.remove(1);
		System.out.println(list);
		
		//정렬
		list.sort(Comparator.reverseOrder());
		System.out.println(list);
	}

}
