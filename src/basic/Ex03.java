package basic;

import java.util.Scanner;

/*
 * [문제] 배열에 5개의 정수를 키보드를 이용하여 저장 후,
 * 		 배열에 저장된 정수를 화면에 출력해보세요.
 * 		 조건) 일반 for문과 단축 for문을 이용하여 출력할 것.
 */

public class Ex03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[5];
		
		for(int i = 0; i < 5; i++) {
			System.out.print((i+1) + "번째 정수를 입력하세요 : ");
			num[i] = sc.nextInt();
		}
		System.out.println();
		
		for(int i= 0; i <5; i++ ) {
			System.out.println("num [" + i + "] = " + num[i]);
		}
		System.out.println();
		
		for(int k : num) {
			System.out.println("num ==> " + k);
			
		}
		
		sc.close();
	}

}
