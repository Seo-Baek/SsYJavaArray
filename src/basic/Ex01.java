package basic;

import java.util.Arrays;

/*
 * 배열(Array) ?
 *    - 하나의 이름으로 동일한 자료형의 데이터를 여러 개
 *   	저장 할 수 있는 메모리를 할당 받는 것을 말함.
 *    - 변수는 하나의 값만을 저장하지만, 
 *      배열은 여러 개의 값을 저장할 수 있다. (- 같은 종류의 데이터를 순차적으로 저장)
 *    - 배열은 선언과 동시에 저장할 수 있는 데이터 타입이 결정이 됨.
 *      만약 다른 타입의 데이터를 저장하려면 타입 불일치 컴파일 오류가 발생한다.
 *    - 배열의 단점 : 배열은 한 번 크기가 정해지면 길이를 늘리거나 줄일 수 없음.
 *    
 *    [배열 사용 절차]
 *    1단계 : 배열 선언(자료형[] 배열명)
 *    2단계 : 배열 메모리 생성(메모리할당 :  배열 = new 자료형[배열의 크기])
 *    3단계 : 배열 초기화(할당 된 영역에 데이터 저장)
 *    4단계 : 배열을 이용(데이터 처리 - 연산, 출력 )
 *    
 *    [배열 생성 방법 - 2가지]
 *    1. new 키워드를 사용하여 배열 생성.
 *    2. 배열의 초기값을 이용하여 배열 생성.
 */

public class Ex01 {

	public static void main(String[] args) {
		
		//1단계 : 배열선언(자료형[] 배열명)
		//int[] score;
		
		//2단계 : 배열 메모리 생성(메모리할당 :  배열 = new 자료형[배열의 크기])
		//score = new int[5]; // 5개의 정수 공간 생성, 배열 이름은 score!

		// 1단계 + 2단계 : 배열 선언 및 배열 메모리 생성(할당)
		int[] score = new int[5];
		System.out.println(score);
		
		//3단계 : 배열 초기화(할당 된 영역에 데이터 저장)
		score[0] = 10;
		score[1] = 20;
		score[2] = 30;
		score[3] = 40;
		score[4] = 50;
		//score[3] = "abc;  오류, 선언했던 같은 자료형만 가능
		
		//4단계 : 배열을 이용(데이터 처리 - 연산, 출력 )
		score[2] += 100;		// score[2] = score[2] + 100;	score[2] = 130;
		score[3] += 50;			// score[3] = score[3] + 50;	score[3] = 90;
		score[4] *= 3;			// score[4] = score[4] * 3;		score[4] = 150;
		
		System.out.println("score[0] ==> " + score[0]);
		System.out.println("score[1] ==> " + score[1]);
		System.out.println("score[2] ==> " + score[2]);
		System.out.println("score[3] ==> " + score[3]);
		System.out.println("score[4] ==> " + score[4]);
		System.out.println();
		
		// 배열 출력 시 반복문을 이용하여 출력해보자.
		for(int i = 0; i < 5; i++) {
			System.out.printf("score[%d] ==> %d\n", i, score[i]);
		}
		System.out.println();
		
		int[] jumsu = new int[3];
		jumsu[0] = 95; jumsu[1] = 88; jumsu[2] = 92;
		
		System.out.println("jumsu[0] ==> " + jumsu[0]);
		System.out.println("jumsu[1] ==> " + jumsu[1]);
		System.out.println("jumsu[2] ==> " + jumsu[2]);
		System.out.println();
		
		//점수를 출력하고 총점을 구하여 출력해보자
		int tot = 0;
		
		for(int i = 0; i <3 ; i++) {
			System.out.println("jumsu[" + i + "] ==> " + jumsu[i]);
			tot += jumsu[i];		//tot = tot + jumsu[i];
		}
		System.out.println("총 점 ==> " + tot + "점");
		
		
	}

}
