package system;

public class SystemEx2 {

	public static void main(String[] args) {
		long sum =0;
		
		long start = System.currentTimeMillis();
		
		for(int i =1;i<10000000; i++) {
			sum+=i;
		}
		long end = System.currentTimeMillis();
		System.out.println("�ɸ��ð�: "+(end-start));
		System.out.println("��: "+ sum);
	}

}
