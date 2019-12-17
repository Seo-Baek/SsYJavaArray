package basic;

import java.util.Scanner;

//내가 여행 가고 싶은 5개 나라를
//키보드로 입력하여 배열에 저장해 보자.

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] nation = new String[5];
		
		//nation 배열에 키보드로 나라를 입력을 받자.
//		System.out.println("첫 번째 나라 입력 : ");
//		nation[0] = sc.next();
//		System.out.println("두 번째 나라 입력 : ");
//		nation[1] = sc.next();
//		System.out.println("세 번째 나라 입력 : ");
//		nation[2] = sc.next();
//		System.out.println("네 번째 나라 입력 : ");
//		nation[3] = sc.next();
		
		for(int i = 0; i < 5; i++) {
			System.out.print((i+1) + "번째 나라 입력 : ");
			nation[i] = sc.next();
		}
		
		//nation 배열에 들어간 데이터를 출력해보자.
		for(int i = 0; i < 5; i++) {
			System.out.println("nation[" + i + "] : " + nation[i]);
		}
		System.out.println();
		
		// 개선된 for문(단축 for문)을 이용하여 출력해보자.
		for(String k : nation) {				// 간단하나 index를 처리할 만한 변수가 없음.
			System.out.println("nation 요소 ==> " + k);	
		}
		
		/*
		 * 개선된 for문 (단축 for문)
		 * 	- java jdk 1.5 버전부터 추가된 기능.
		 * 	- 주로 배열의 요소(원소)를 처리(출력)할 때 사용함.
		 * 		형식)
		 * 			for(자료형 변수명 : 배열명) {
		 * 					반복실행문;
		 * 			}
		 * 
		 * 		실행)
		 * 		- 배열의 첫번째 원소를 좌변의 변수에 할당하여
		 * 		  반복문을 이용하여 출력하되 원소의 수만큼 자동 반복하여 출력.
		 * 
		 * 		주의)
		 * 		- 우변의 배열명의 자료형과 좌변의 자료형은
		 * 		 반드시 일치하여야 한다.
		 * 		- 만약 일치하지 않을 경우 error 발생.
		 */
		
		
		sc.close();
		
	}//main

}//class
 