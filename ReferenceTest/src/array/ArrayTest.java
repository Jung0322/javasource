package array;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score[] = { 78, 65, 95, 88, 36,45,25,47, 87, 43};
		int temp = 0;
		for (int i = 0 ; i< score.length;i++) {
			for(int j = 0 ; j < score.length; j++) {
				if(score[i]>score[j]) {
					temp = score[i];
					score[i] = score[j];
					score[j] = temp;
				}
			}
		}
		
		int top = score[0];
		int low = score[9];
		System.out.println(top +" "+ low);
	}

}
