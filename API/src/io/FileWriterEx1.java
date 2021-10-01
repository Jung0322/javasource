package io;

import java.io.File;
import java.io.FileWriter;

public class FileWriterEx1 {

	public static void main(String[] args) {
		try (FileWriter writer =  new FileWriter(new File("e:\\temp\\test2.txt"),true)){
			writer.write("FileWriter는 문자열을 바로\r\n");
			writer.write("출력할 수 있다 ");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
