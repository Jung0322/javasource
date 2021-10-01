package stringtokenizer;

import java.util.StringTokenizer;

public class Token1 {
	public static void main(String[] args) {
		String textString = "È«±æµ¿/¼ºÃáÇâ/¹Ú¿¬¼ö/ÀÌ¼öÈ«";
		
		String[] nameStrings = textString.split("/");
		for(String s:nameStrings)
			System.out.println(s);
		
		StringTokenizer stringTokenizer = new StringTokenizer(textString, "/");
		while(stringTokenizer.hasMoreTokens()) {
			System.out.println(stringTokenizer.nextToken());
		}
	}

}
