import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

public class ForTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		/*
		for( int i = 0 ; i < 100 ; i+=3) {
			if( i%9 == 0) {
				continue;
			}
			sum +=i;
		}
		*/
		
		for( int i = 1 ; i < 100 ; i++) {
			if(i%3 == 0 || i%5 == 0){
				sum +=i;
			}
		}
		System.out.println("гую╨: " + sum);
	}

}
