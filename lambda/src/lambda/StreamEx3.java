package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamEx3 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("바둑","바나나","포도","딸기","바질","강아지");
		
		//바로 시작하는 문자 찾아서 출력
//		for(String str:list) {
//			if(str.startsWith("바")) {
//				System.out.println(str);
//			}
//		}
		
		//filler:조건에 맞는 요소 찾기
		list.stream().filter(s-> s.startsWith("바")).forEach(System.out::println);
	}
	
	
}
