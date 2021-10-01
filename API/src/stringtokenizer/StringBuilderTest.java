package stringtokenizer;

public class StringBuilderTest {

	public static void main(String[] args) {
		// ��Ƽ������ ����
		StringBuffer buffer = new StringBuffer();
		
		// ���Ͻ����� ����
		StringBuilder builder = new StringBuilder();
		
		//�߰�
		builder.append("ABC");
		builder.append("DEF");
		System.out.println(builder);
		
		//����
		builder.insert(3, "34");
		System.out.println(builder);
		
		//����
		builder.delete(1, 3);
		System.out.println(builder);
		
		String str1 =  "Java Programming";
		StringBuilder builder1 = new StringBuilder(str1);
		builder1.append(3.14);
	}

}
