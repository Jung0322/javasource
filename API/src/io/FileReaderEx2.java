package io;

import java.io.FileReader;
import java.io.Reader;

public class FileReaderEx2 {
	/*
	 * 처리할 파일이 문자라면 Reader, Writer가 편함 char 형태로 처리
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
