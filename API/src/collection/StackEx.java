package collection;

import java.util.Stack;

public class StackEx {
	// Stack : LIFO(Last In First Out)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stack = new Stack<String>();
		
		//������ ����
		stack.push("���");
		stack.push("����");
		stack.push("�ٳ���");
		stack.push("��");
		
		//������ ��������
		System.out.println(stack);
		
		System.out.println();
		
		while(!stack.empty()) {
			System.out.println(stack.pop());
			
		}
	}

}
