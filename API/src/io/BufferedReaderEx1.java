package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferedReaderEx1 {

	public static void main(String[] args) {
		try (FileReader fr = new FileReader("e:\\temp\\file1.txt");
				BufferedReader br = new BufferedReader(fr);
				FileWriter fw = new FileWriter("e:\\temp\test5.txt");
				BufferedWriter bw =  new BufferedWriter(fw)){
			
			String line = "";
			
			while((line=br.readLine())!=null) {
				bw.write(line);
				bw.newLine(); //ฟฃลอ
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
