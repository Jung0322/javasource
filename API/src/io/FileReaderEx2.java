package io;

import java.io.FileReader;
import java.io.Reader;

public class FileReaderEx2 {
	/*
	 * ó���� ������ ���ڶ�� Reader, Writer�� ���� char ���·� ó��
	 * 
	 */

	public static void main(String[] args) {
		try (Reader reader = new FileReader("e:\\temp\\file1.txt")) {

			char[] cbuf = new char[100];
			
			boolean readcharNo;
			
			while (readcharNo = reader.read(cbuf) != -1) {
				System.out.println(cbuf);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
