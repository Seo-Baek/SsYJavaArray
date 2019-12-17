package practise;

import java.util.Scanner;

public class Problem02 {
	
	public static void main(String[] args) {
		
//		문 ) 임의의 숫자 5 개를 키보드로 입력 받아서 배열에 저장한 후 ,
//	내림차순으로 정렬하여 출력하시오 .
//	예 ) 10,30,40,20,50 => 50,40,30,20,10
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		System.out.println("5개의 숫자를 입력하세요.");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("=== 내림차순으로 정렬 ===");
		
		int temp = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.print(arr[i] + "\t");
		}
		
		
		
	}
}
