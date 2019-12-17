package basic;

/*
 * 다차원 배열
 * - 1차원 배열이 여러 개 묶여 있는 형태의 배열을 말함
 * - 행과 열의 개념이 적용된다.
 */

public class Ex08 {

	public static void main(String[] args) {
		
		// 1. 다차원 배열 선언 및 메모리 생성
		int[][] arr = new int[3][2];	//앞이 행의 크기 뒤가 열의 크기
		
		//2. 배열의 초기화 작업
		int cnt = 10;
		for(int i = 0; i < 3; i++) {
			for(int j = 0; i <2; j++) {
				arr[i][j] = cnt;
				cnt += 10;
			}//내부 for문
		}//외부 for문
	}

}
