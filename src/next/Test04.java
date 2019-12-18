package next;

public class Test04 {

	public static void main(String[] args) {
		
		int[][] arr = new int[5][5];
		int cnt = 1;
		
		for(int i = 0;  i < arr.length; i++) {
			int a = 0;
			int b = 0;
			if(i == 0 || i % 2 != 0) {
				for(a = i; a < arr.length - i; a++){
					arr[i][a] = cnt++;
				}
				for(b = i+1; b < arr.length - i; b++){
					arr[b][a] = cnt++;
				}
			} else {
				for(a = a-1; a <arr.length - i; a--){
					arr[b][a] = cnt++;
				}
				for(b = b-a; b < arr.length - i; b--) {
					arr[b][a] = cnt++;
				}
			}



		}
			
		
	}//main

}//class
