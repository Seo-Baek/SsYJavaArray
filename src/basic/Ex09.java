package basic;

import java.util.Scanner;

/*
 * 정렬작업
 * 키보드로 임의의 정수 5개를 입력.
 * 예) 43, 19, 6, 97, 65
 */

public class Ex09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print((i+1) + "번째 정수 입력 : ");
			arr[i] = sc.nextInt();
		}
		
		//내림차순 정렬
		int temp = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] < arr[j]) {
					//두 수를 교환하는 작업
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				
			}
		}
		
		// 내림차순으로 정렬한 배열을 화면에 출력해보자.
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
			
		}
		
		sc.close();
	}

}
