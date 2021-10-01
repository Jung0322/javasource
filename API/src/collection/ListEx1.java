package collection;

import java.util.ArrayList;
import java.util.List;

public class ListEx1 {
	/*
	 * List(�������̽�) : ������ �ִ�. ������ �ߺ� ���� ����Ŭ���� : Vector, ArrayList, LinkedList,
	 * Stack... �迭�� ���� �����ε�, ��� ��Ų ���� E,T,K,V : ���� ��ü Ÿ���� ����
	 * 
	 * �⺻Ÿ�� => ��ü Ÿ��(Wrapper Ŭ����) int => Integer, float => Float, double => Double,
	 * char=> Character, boolean => Boolean
	 * 
	 */

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();

		// ������ �߰�
		list1.add("���");
		list1.add("��");
		list1.add("������");
		list1.add("����");
		list1.add("����");
		list1.add("�ٳ���");

		// ������ ��������
		for (String str : list1) {
			System.out.println(str);
		}

		System.out.println();

		System.out.println(list1); // toString() �������̵� �Ǿ� ����

		System.out.println();

		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}

		System.out.println();

		list2.add(10);
		list2.add(20);
		list2.add(30);
		list2.add(40);
		list2.add(50);
		list2.add(60);

		int sum = 0;
		for (Integer integer : list2) {
			sum += integer;
			System.out.println(integer);
		}
		System.out.println("����: " + sum);

	}

}
