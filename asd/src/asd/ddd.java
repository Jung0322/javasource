package asd;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ddd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("������ 3�� �Է��ϼ���");
        int sum = 0, n = 0;
        for(int i = 0; i < 3; i++){
            System.out.print(i + ">>");
            try {
                n = sc.nextInt();
            } catch (Exception e) {
                System.out.println("������ �ƴմϴ�. �ٽ� �Է��ϼ���");
                sc.nextLine(); 
                i--; 
            }
            sum += n;
        }
        System.out.println("���� " + sum);
        System.out.printf("%d%%", sum);
        sc.close();
    }
		

}


