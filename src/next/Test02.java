package next;

public class Test02 {

	public static void main(String[] args) {
		
		// 1. 2차원 배열을 만들자.
		int[][] arr = new int [5][5];
		int count = 1;
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				arr[j][i] = count++;
			}
		}
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
