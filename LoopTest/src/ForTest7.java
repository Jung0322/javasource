
public class ForTest7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1 ; i <= 10 ; i++ ) {
			for(int j = 1 ; j <= 10 ; j++) {
				int a =  (4 * i) + (5 * j);
				if (a == 60) {
					System.out.println("( " + i + ", "+ j +" )"  );
				}
			}
		}
	}

}
