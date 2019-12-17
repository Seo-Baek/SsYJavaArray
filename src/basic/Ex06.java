package basic;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		// 키보드로 배열의 크기를 입력을 받아 보자.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열의 크기를 입력하세요. : ");
		//int size = sc.nextInt();
		
		int[] arr = new int[sc.nextInt()];	
		// 키보드에서 바로 받아쓰면 변수를 선언하지 않아도 되지!
		// 크기는 정수형만 들어가니 nextInt()만 들어갈 수 있다!
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print((i+1) + "번째 정수 입력 : ");
			arr[i] = sc.nextInt();
		}
		
		for(int s : arr) {
			System.out.println("arr 배열 요소 ==> " + s);
		}
		
	}

}
