package io;

import java.io.File;

public class FileEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("c:\\temp\\InputStreamEx1.java");

		// ���� �̸�
		String fileString = file.getName();

		// .�� ��ġ
		int index = fileString.indexOf(".");

		System.out.println("���ϸ�: " + fileString);
		System.out.println("Ȯ���ڸ� ������ ���ϸ�: " + fileString.substring(0, index));
		System.out.println("Ȯ����: " + fileString.substring(index + 1));

		System.out.println("��θ� ������ ���ϸ�: " + file.getPath());
		System.out.println("������ ���� �ִ� ������: " + file.getParent());

		System.out.println("File.separator : " + file.separator);
		System.out.println("File.pathseparator : " + file.pathSeparator);
	}

}
