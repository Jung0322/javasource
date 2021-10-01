package Test;

public class SwitchEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade = 'a';
		
		/*switch (grade) {
		case 'b':
		case 'B':
			System.out.println("일반회원");
			break;
		case 'a':
		case 'A':
			System.out.println("우수회원");
			break;

		default:
			System.out.println("손님");
			break;
		}
		*/
		
		if ( grade == 'b' || grade == 'B') {
			System.out.println("일반회원");
		}else if( grade == 'a' || grade == 'A'){
			System.out.println("우수회원");
		}else {
			System.out.println("손님");
		}
	}

}
