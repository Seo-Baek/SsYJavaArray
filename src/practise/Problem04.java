package practise;

import java.util.Scanner;

public class Problem04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("학생 수를 입력하세요. : ");
		
		double[][] nArr = new double[sc.nextInt()][3];
		String[][] sArr = new String[nArr.length][2];
		
//		for(int i = 0; i < nArr.length; i++) {
//			System.out.print("이름 입력 : ");
//			sArr[i][0] = sc.next();
//			System.out.print("국어점수 입력 : ");
//			nArr[i][0] = sc.nextInt();
//			System.out.print("영어점수 입력 : ");
//			nArr[i][1] = sc.nextInt();
//			System.out.print("수학점수 입력 : ");
//			nArr[i][2] = sc.nextInt();
//			nArr[i][3] = nArr[i][0] + nArr[i][1] + nArr[i][2];
		
		for(int i = 0; i < nArr.length; i++) {
			int kor = 0, eng = 0, mat = 0;
			System.out.print("이름 입력 : ");
			sArr[i][0] = sc.next();
			System.out.print("국어점수 입력 : ");
			kor = sc.nextInt();
			System.out.print("영어점수 입력 : ");
			eng = sc.nextInt();
			System.out.print("수학점수 입력 : ");
			mat = sc.nextInt();
			
			nArr[i][0] = kor + eng + mat;
			nArr[i][1] = nArr[i][0] / 3.0;
			
			switch((int)nArr[i][1] / 10) {
				case 10 : 
				case 9 :
					sArr[i][1] = "A학점";
					break;
				case 8 :
					sArr[i][1] = "B학점";
					break;
				case 7 :
					sArr[i][1] = "C학점";
					break;
				case 6 :
					sArr[i][1] = "D학점";
					break;
				default :
					sArr[i][1] = "F학점";
					
			}
			
		}
		
		
//		int temp = 0;
//		for(int i = 0; i < nArr.length; i++) {
//			for(int j = i+1; j < nArr.length; j++) {
//				if(nArr[i][5] < nArr[j][5]) {
//					temp = (int)nArr[i][5];
//					nArr[i][5] = nArr[j][5];
//					nArr[j][5] = temp;
//				}
//			}	
//		}
//		
//		for(int i = 0; i < nArr.length; i++) {
//			for(int j = 0; j < nArr.length; j++) {
//				if(nArr[i][3] == nArr[j][5]) {
//					nArr[i][6] = (j+1);
//			}
//			
//			}
//			
//		}
		
		for(int i = 0; i < nArr.length; i++) {
			nArr[i][2] = 1;
			for(int j = 0; j < nArr.length; j++) {
				if(nArr[i][0] < nArr[j][0]) {
					nArr[i][2]++;
				}
			}
			
		
		}

		for(int i = 0; i < nArr.length; i++) {
			System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
			System.out.print("이름 : " + sArr[i][0] + "\t");
			System.out.printf("총점 : " + (int)nArr[i][0] + "점" + "\t");
			System.out.printf("평균 : %.2f점\t", nArr[i][1]);
			System.out.print("학점 : " + sArr[i][1] + "\t");
			System.out.println("순위 : " + (int)nArr[i][2] + "등");
		}
		
	
	}

}
