package io;

import java.io.File;

public class FileEx1 {
	/* File
	 * ������ �ٷ�� ���� Ŭ����
	 * ����(���丮) : / , \
	 * 
	 *  
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file1 = new File("c:\\temp\\test1.txt");
		File file2 = new File("c:\\temp","test1.txt");
		
		File file3 = new File("c:\\temp");
		File file4 = new File(file3,"test1.txt");
		// File file4 = new File(new File("c:\\temp"),"test1.txt");
		
		
	}

}
