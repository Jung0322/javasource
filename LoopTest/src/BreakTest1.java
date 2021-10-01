
public class BreakTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		while (true) {
			a =(int) (Math.random()*6)+1; 
			b =(int) (Math.random()*6)+1;
			if (a+b == 5) {
				System.out.println("Á¾·á");
				break;
			}
			System.out.println("¾Æ´Ô");

		}
	}

}
