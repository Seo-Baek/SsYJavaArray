package practise;

import java.util.Scanner;

public class Problem01 {

	public static void main(String[] args) {
		
//		문 ) 키보드로 배열의 크기를 입력 받아서 생성된 배열요소 만큼
//	임의의 정 수를 키보드로 입력 받은 후 그 중 최대값과 최소값을
//	구하시오 .
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열 크기 : ");
		int arr[] = new int[sc.nextInt()];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print((i+1) + "번째 값 입력 : ");
			arr[i] = sc.nextInt();
		}
		
//		int temp = 0;
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = i+1; j < arr.length; j++) {
//				if(arr[j] > arr[i]) {
//					temp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = temp;
//				}
//			}//내부for문
//		}//외부 for문
//		
//		System.out.println("max : " + arr[0] + ", min : " + arr[(arr.length-1)]);
		int max = -999;
		int min = 999;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		System.out.println("max : " + max + " min : " + min);
	}

}
