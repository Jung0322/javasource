package io;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileEx3 {

	public static void main(String[] args) {
		File tempFile = new File("e:\\temp");
		File dir = new File("e:\\temp\\dir");
		File file1 = new File("e:\\temp\\file1.txt");
		File file2 = new File("e:\\temp\\file2.txt");
		File file3 = new File(tempFile, "file3.txt");
		File file4 = new File("e:\\temp\\dir\\file4.txt");

		if (!tempFile.exists()) {
			tempFile.mkdir();
		}

		if (!dir.exists()) {
			dir.mkdir();
		}
		try {
			if (!file1.exists()) {
				file1.createNewFile();
			}
			if (!file2.exists()) {
				file2.createNewFile();
			}
			if (!file3.exists()) {
				file3.createNewFile();
			}
			if (!file4.exists()) {
				file4.createNewFile();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println("\t날짜\t시간\t형태\t크기\t이름");
		System.out.println("-------------------------");
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
		File content[] = tempFile.listFiles();
		for(File f:content) {
			System.out.print(simpleDateFormat.format(new Date(f.lastModified())));
			if(f.isDirectory())
				System.out.print("\t<DIR>\t\t"+f.getName());
			else {
				System.out.print("\t\t"+f.length()+"\t"+f.getName());
			}
			System.out.println();
		}
	}

}
