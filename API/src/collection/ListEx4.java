package collection;

import java.util.LinkedList;
import java.util.List;

public class ListEx4 {

	public static void main(String[] args) {
		/*
		 * ���������� �߰�/���� �� ArrayList �� �� ����
		 * �߰� �����͸� �߰�/���� �� LinkedList�� �� �� ����
		 */
		List<String> list = new LinkedList<String>();
		
		//�߰�
		list.add("���");
		list.add("��");
		list.add("������");
		list.add("����");
		list.add("����");
		list.add("�ٳ���");
		
		System.out.println(list);
	}

}
