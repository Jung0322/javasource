package io;

import java.io.File;

public class FileEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("c:\\temp\\InputStreamEx1.java");

		// 파일 이름
		String fileString = file.getName();

		// .의 위치
		int index = fileString.indexOf(".");

		System.out.println("파일명: " + fileString);
		System.out.println("확장자를 제외한 파일명: " + fileString.substring(0, index));
		System.out.println("확장자: " + fileString.substring(index + 1));

		System.out.println("경로를 포함한 파일명: " + file.getPath());
		System.out.println("파일이 속해 있는 폴더명: " + file.getParent());

		System.out.println("File.separator : " + file.separator);
		System.out.println("File.pathseparator : " + file.pathSeparator);
	}

}
