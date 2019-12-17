package basic;

/*
 * 다차원 배열의 가변 배열
 *  - java의 다차원 배열은 행마다 서로 다른 열을 갖는다.
 *  - 다차원 배열의 가변배열(행마다 메모리 크기를 다르게 설정할 수 있음.)
 *  - 사용 이유 : 메모리 손실을 최소화 시켜 주기 위함.
 */

public class Ex10 {

	public static void main(String[] args) {

		//1. 다차원 배열의 가변배열 선언 및 메모리 생성
		int[][] arr = new int[5][];		// 행 : 5행, 열 : 미지정
		
		//2. 열 메모리 생성
		arr[0] = new int [3]; 	//1행3열
		arr[1] = new int [2]; 	//2행2열
		arr[2] = new int [4]; 	//3행4열
		arr[3] = new int [1]; 	//4행1열
		arr[4] = new int [5]; 	//5행5열
		
		//3. 배열에 초기화 할당.
		int cnt = 10;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = cnt;
				cnt += 10;
			}
			
		}
		
		//4. 가변 배열을 출력해보자
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("%4d  |  ",arr[i][j]);
			}
			System.out.println();
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		}
				
	}

}
