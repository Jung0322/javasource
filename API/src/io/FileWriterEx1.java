package io;

import java.io.File;
import java.io.FileWriter;

public class FileWriterEx1 {

	public static void main(String[] args) {
		try (FileWriter writer =  new FileWriter(new File("e:\\temp\\test2.txt"),true)){
			writer.write("FileWriter�� ���ڿ��� �ٷ�\r\n");
			writer.write("����� �� �ִ� ");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
