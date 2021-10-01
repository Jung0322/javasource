package stringtokenizer;

public class StringBuilderTest {

	public static void main(String[] args) {
		// 멀티스레드 지원
		StringBuffer buffer = new StringBuffer();
		
		// 단일스레드 지원
		StringBuilder builder = new StringBuilder();
		
		//추가
		builder.append("ABC");
		builder.append("DEF");
		System.out.println(builder);
		
		//삽입
		builder.insert(3, "34");
		System.out.println(builder);
		
		//삭제
		builder.delete(1, 3);
		System.out.println(builder);
		
		String str1 =  "Java Programming";
		StringBuilder builder1 = new StringBuilder(str1);
		builder1.append(3.14);
	}

}
