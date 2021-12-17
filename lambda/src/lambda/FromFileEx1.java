package lambda;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FromFileEx1 {

	public static void main(String[] args) {
		//data.txt 읽어서 화면 출력
		Path path = Paths.get("src/lambda/data.txt");
		
		try {
			Files.lines(path,Charset.defaultCharset()).forEach(System.out::println);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
