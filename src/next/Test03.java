package next;

/*
 *  1
 *  2  3
 *  4  5  6 
 *  7  8  9 10
 * 11 12 13 14 15 
 * 
 */

public class Test03 {

	public static void main(String[] args) {
		
		//2차원 배열을 만들자.
		int[][] arr = new int[5][];
		int count = 1;
		
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = 0; j < arr[i].length; j++) {
//				if(j <= i) {
//					arr[i][j] = count++;
//	            }
//				
//			}
//		}
		
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = 0; j < i+1; j++) {
//				arr[i][j] = count++;
//			}
//		}
//		
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = 0; j <arr[i].length; j++) {
//				String value = (arr[i][j] == 0) ? " " : ""+arr[i][j];
//				System.out.print(value + "\t");
//				//System.out.print(arr[i][j] + "\t");
//			}
//			System.out.println();
//		}
		
		for(int i = 0; i <arr.length; i++) {
			arr[i] = new int [i+1];
			for(int j = 0; j <arr[i].length; j++) {
				arr[i][j] = count++;
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j <arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
	}

}
