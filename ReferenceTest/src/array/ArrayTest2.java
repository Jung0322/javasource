package array;

public class ArrayTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {10,20,30};
		int arr2[] = new int[4];
		int score[][] = {
				{100,100,100},
				{20,20,20},
				{30,40,30},
				{40,50,20},
				{50,60,50}
		};

		
		System.out.print(arr2[1]);
		
		int result[][] = new int [score.length+1] [score[0].length+1];
		
		for (int  i = 0 ; i <score.length;i++) {
			for (int j = 0 ; j <score[i].length; j++) {
				result[i][j] = score[i][j];
				result[i][result[i].length-1]+=result[i][j];
				result[result.length-1][result[i].length-1]+=score[i][j];
			}
		}
		
		
		for (int  i = 0 ; i < score[i].length;i++) {
			int sum = 0;
			for (int j = 0 ; j <score.length; j++) {
				sum += result[j][i];
			}

			result[score.length][i] = sum;
		}
	
		for (int  i = 0 ; i <result.length;i++) {
			for (int j = 0 ; j <result[j].length; j++) {
				System.out.print(result[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
}
