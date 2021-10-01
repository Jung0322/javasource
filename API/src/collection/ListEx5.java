package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> arrayList = new ArrayList<String>();
		List<String> linkList = new LinkedList<String>();

		System.out.println("*****순차적 추가*****");

		System.out.println("ArrayList 걸린시간: " + add1(arrayList));
		System.out.println("LinkedList 걸린시간: " + add1(linkList));

		System.out.println("*****중간에서 추가*****");
		System.out.println("ArrayList 걸린시간: " + add2(arrayList));
		System.out.println("LinkedList 걸린시간: " + add2(linkList));

		System.out.println("*****중간에서 삭제*****");
		System.out.println("ArrayList 걸린시간: " + remove1(arrayList));
		System.out.println("LinkedList 걸린시간: " + remove1(linkList));

		System.out.println("*****순차적으로 삭제*****");
		System.out.println("ArrayList 걸린시간: " + remove2(arrayList));
		System.out.println("LinkedList 걸린시간: " + remove2(linkList));

	}

	// 순차적 추가
	public static long add1(List<String> list) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++) {
			list.add(i + "");
		}
		long end = System.currentTimeMillis();
		return end - start;
	}

	// 중간에 추가
	public static long add2(List<String> list) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			list.add(500, "X");
		}
		long end = System.currentTimeMillis();
		return end - start;
	}

	// 중간에서 삭제
	public static long remove1(List<String> list) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			list.remove(i);
		}
		long end = System.currentTimeMillis();
		return end - start;
	}

	// 순차적인 삭제
	public static long remove2(List<String> list) {
		long start = System.currentTimeMillis();
		for (int i = list.size() - 1; i >= 0; i--) {
			list.remove(i);
		}
		long end = System.currentTimeMillis();
		return end - start;
	}

}
