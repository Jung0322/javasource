package stringtokenizer;

import java.util.StringTokenizer;

public class Token1 {
	public static void main(String[] args) {
		String textString = "ȫ�浿/������/�ڿ���/�̼�ȫ";
		
		String[] nameStrings = textString.split("/");
		for(String s:nameStrings)
			System.out.println(s);
		
		StringTokenizer stringTokenizer = new StringTokenizer(textString, "/");
		while(stringTokenizer.hasMoreTokens()) {
			System.out.println(stringTokenizer.nextToken());
		}
	}

}
