package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamEx2 {

	public static void main(String[] args) {
		/*
		FileInputStream fileInputStream = null;
		FileOutputStream fileOutputStream = null;
		try {
			fileInputStream = new FileInputStream(new File("e:\\temp\\file1.txt"));
			fileOutputStream = new FileOutputStream("e:\\temp\\test1.txt");
			
			byte datas[]= new byte[100];
			while(fileInputStream.read(datas)!=-1) {
				fileOutputStream.write(datas);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fileInputStream.close();
				fileOutputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		*/
		try(FileInputStream fileInputStream = new FileInputStream(new File("e:\\temp\\file1.txt"));
			FileOutputStream fileOutputStream = new FileOutputStream("e:\\temp\\test1.txt");) {
			byte datas[]= new byte[100];
			while(fileInputStream.read(datas)!=-1) {
				fileOutputStream.write(datas);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}  catch (IOException e) {
			e.printStackTrace();
		} 
	}

}
