package basic;

// 2. 배열의 초기값을 이용하여 배열 생성

public class Ex04 {

	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50};
		
		arr[3] += 50;
		
		for(int s : arr) {
			System.out.println("arr 배열 요소 ==> " + s);
		}
				 
	}

}
