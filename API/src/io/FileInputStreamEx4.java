package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileInputStreamEx4 {

	public static void main(String[] args) {
	
		FileInputStream fileInputStream = null;
		FileOutputStream outputStream =null;
		
		try {
			fileInputStream = new FileInputStream(new File("e:\\temp\\Rolling.mp3"));
			outputStream = new FileOutputStream("e:\\temp\\Rolling_copy.mp3");
			
			byte [] dates = new byte[2000];
			while(fileInputStream.read(dates)!=-1) {
				outputStream.write(dates);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fileInputStream.close();
				outputStream.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		

		
	}
	

}
