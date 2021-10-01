package Test;

import java.util.Random;
import java.util.Scanner;

public class SwitchEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// *4는 범위 0~3 / +8은 0~3 + 8
		int a = (int) (Math.random()*4)+8;
		
		switch (a) {
		case 8:
			System.out.println("출근을 함");
			break;
		case 9:
			System.out.println("회의를 함");
			break;
		case 10:
			System.out.println("업무를 함");
			break;
		default:
			System.out.println("외근을 함");
			break;
		}
	}

}
