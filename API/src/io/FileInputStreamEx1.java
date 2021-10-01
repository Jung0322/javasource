package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileInputStreamEx1 {

	public static void main(String[] args) {
		/*
		InputStream in = null;
		OutputStream outputStream = System.out;
		
		byte[] datas = new byte[100];
		try {
			in = new FileInputStream("e:\\temp\\file1.txt");
			while (in.read(datas)!=-1) {
				outputStream.write(datas);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException  e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				in.close();
				outputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		*/
		//try-with-resources(JDK 7부터) : 자동으로 자원 해체
		try (InputStream in = new FileInputStream("e:\\temp\\file1.txt");
				OutputStream outputStream = System.out;){
			byte[] datas = new byte[100];
			while (in.read(datas)!=-1) {
				outputStream.write(datas);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
