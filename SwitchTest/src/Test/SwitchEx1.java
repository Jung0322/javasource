package Test;

public class SwitchEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade = 'a';
		
		/*switch (grade) {
		case 'b':
		case 'B':
			System.out.println("�Ϲ�ȸ��");
			break;
		case 'a':
		case 'A':
			System.out.println("���ȸ��");
			break;

		default:
			System.out.println("�մ�");
			break;
		}
		*/
		
		if ( grade == 'b' || grade == 'B') {
			System.out.println("�Ϲ�ȸ��");
		}else if( grade == 'a' || grade == 'A'){
			System.out.println("���ȸ��");
		}else {
			System.out.println("�մ�");
		}
	}

}
