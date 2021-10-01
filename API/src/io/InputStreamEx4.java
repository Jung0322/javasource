package io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.DateFormatSymbols;

public class InputStreamEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		
		byte [] dates = new byte[100];
		
		System.out.print("�̸� : ");
		try {
			int nameBytes = inputStream.read(dates);
			String nameString = new String(dates,0,nameBytes-2);
			
			System.out.print("�ϰ������:");
			int commentBytes = inputStream.read(dates);
			String commentString = new String(dates,0,commentBytes-2);
			
			System.out.println("�Է��� �̸�: "+nameString);
			System.out.println("�Է��� �ϰ���� ��: "+commentString);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				inputStream.close();
				outputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
