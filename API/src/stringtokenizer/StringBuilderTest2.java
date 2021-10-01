package stringtokenizer;

public class StringBuilderTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "hello java!!!";
		
		//String 형태로 두고 거꾸로 출력
		
		char [] chArr = str1.toCharArray();
		
		for(int i=chArr.length-1;i>=0;i--) {
			System.out.print(chArr[i]+" ");
		}
		System.out.println();
		for(int i=str1.length()-1;i>=0;i--) {
			System.out.print(str1.charAt(i));
		}
			
		
		System.out.println();
		//StringBuilder 거꾸로 출력
		StringBuffer stringBuffer = new StringBuffer(str1);
		System.out.println(stringBuffer.reverse());
		
	}

}
