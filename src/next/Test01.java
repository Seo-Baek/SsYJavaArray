package next;

public class Test01 {

	public static void main(String[] args) {
		
		// 1. 2차원 배열을 선언한다.
		int[][] arr = new int[3][3];
		int count = 1;
		
		//2. 초기화를 해준다.
		for(int i = 0; i < arr.length; i++) {		//행의 개념
			for(int j = 0; j <arr[i].length; j++) {	//열의 개념
				arr[i][j] = count++;
			}
		}
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(i == arr.length-1) {
					arr[i][j] = arr[i-(arr.length-1)][j] - arr.length;
				} else {
				arr[i][j] = arr[i+1][j];
				}
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		

	}
}
