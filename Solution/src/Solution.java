
public class Solution {
	
	public static int[] solution(int[] arr) {
		
        int[] answer = {};
        int a = 0;
        int temp = 0 ;
        for( int i = 0 ; i < arr.length; i++){
            for ( int j = 1 ; j < arr.length-1; j ++ )
                if(arr[i] < arr[j]){
                    arr[i] = temp;
                    arr[i] =  arr[j];
                    arr[j] = temp;
                }
        }
        if (arr.length <=1 )
            answer[0] = -1;
        else{
            for ( int i = 0 ; i < arr.length-1; i ++ )
                answer[i] = arr[i];
        }
        return answer;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = {4,3,2,1};
		System.out.println(solution(arr));
	}

}
