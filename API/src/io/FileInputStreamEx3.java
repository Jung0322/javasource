package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileInputStreamEx3 {

	public static void main(String[] args) {
		/*
		 * FileInputStream fileInputStream = null; FileOutputStream fileOutputStream =
		 * null; try { fileInputStream = new FileInputStream(new
		 * File("e:\\temp\\picture.jpg")); fileOutputStream = new
		 * FileOutputStream("e:\\temp\\pciture_copy.jpg");
		 * 
		 * byte[] datas = new byte[1024]; while(fileInputStream.read(datas)!=-1) {
		 * fileOutputStream.write(datas); } } catch (Exception e) { e.printStackTrace();
		 * }finally { try { fileInputStream.close(); fileOutputStream.close(); } catch
		 * (Exception e2) { // TODO: handle exception } }
		 */

		try (FileInputStream fileInputStream = new FileInputStream(new File("e:\\temp\\picture.jpg"));
				FileOutputStream fileOutputStream = new FileOutputStream("e:\\temp\\pciture_copy.jpg");) {
			byte[] datas = new byte[1024];
			while (fileInputStream.read(datas) != -1) {
				fileOutputStream.write(datas);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
