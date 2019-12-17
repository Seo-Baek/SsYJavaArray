package basic;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 배열의 크기를 입력하세요. : ");
		
		String[] str = new String[sc.nextInt()];
		
		for(int i = 0; i < str.length ; i++) {
			System.out.print((i+1) + "번째 문자열 입력 : ");
			str[i] = sc.next();
		}
		System.out.println();
		
		//str 배열에 저장된 문자열 검색
		System.out.print("검색할 문자열을 입력하세요. : ");
		String search = sc.next();
		
		// 배열에 검색어가 존재하는지 확인
		
		for(int i = 0; i < str.length; i++) {
			if(search.equals(str[i])) {
				System.out.println("찾은 문자열 ==> " + str[i]);
				System.out.println("찾은 인덱스 ==> str[" + i + "]");
			}
		}
		
		sc.close();
		
	}

}
