package Test;

import java.util.Random;
import java.util.Scanner;

public class SwitchEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// *4�� ���� 0~3 / +8�� 0~3 + 8
		int a = (int) (Math.random()*4)+8;
		
		switch (a) {
		case 8:
			System.out.println("����� ��");
			break;
		case 9:
			System.out.println("ȸ�Ǹ� ��");
			break;
		case 10:
			System.out.println("������ ��");
			break;
		default:
			System.out.println("�ܱ��� ��");
			break;
		}
	}

}
