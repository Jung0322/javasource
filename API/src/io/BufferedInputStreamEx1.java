package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedInputStreamEx1 {

	public static void main(String[] args) {
		FileInputStream fileInputStream = null ;
		BufferedInputStream bufferedInputStream = null;
		FileOutputStream fileOutputStream = null;
		BufferedOutputStream bufferedOutputStream = null;
		try {
			fileInputStream = new FileInputStream("e:\\temp\\file1.txt");
			bufferedInputStream = new BufferedInputStream(fileInputStream);
			fileOutputStream = new FileOutputStream("e:\\temp\\test4.txt");
			bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
			
			int data;
	         while((data=bufferedInputStream.read())!= -1) {
	        	 bufferedOutputStream.write(data);
	         }
	         bufferedOutputStream.flush();
			bufferedOutputStream.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bufferedInputStream.close();
				fileInputStream.close();
				bufferedOutputStream.close();
				fileOutputStream.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		
		}
	}

}
