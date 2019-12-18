package practise;

import java.util.Scanner;

public class Solved03 {

	public static void main(String[] args) {
		
		// 1. 키보드로 학생의 수를 입력을 받자.
		Scanner sc = new Scanner(System.in);
		System.out.print("학생 수를 입력하세요. : ");
		//int num = sc.nextInt();
		
		// 1-1. 학생 배열, 국어점수 배열, 영어점수 배열, 수학점수 배열,
		String [] name = new String[sc.nextInt()];
		int[] kor = new int [name.length];
		int[] eng = new int [kor.length];
		int[] mat = new int [kor.length];
		int[] sum = new int [kor.length];
		float[] avg = new float [kor.length];
		String[] grade = new String [kor.length];
		int[] rank = new int [kor.length];
		
		
		// 2. 학생의 수(인원)만큼 국어점수, 영어점수, 수학점수를 키보드로 입력받자. - 반복
		for(int i = 0; i < rank.length; i++) {
			System.out.print("학생 이름 입력 : ");
			name[i] = sc.next();
			System.out.print("국어점수 입력 : ");
			kor[i] = sc.nextInt();
			System.out.print("영어점수 입력 : ");
			eng[i] = sc.nextInt();
			System.out.print("수학점수 입력 : ");
			mat[i] = sc.nextInt();
			System.out.println();
			//////////// 이름과 점수 입력 끝 ///////////////
			
			// 3. 총점을 구하자.
			sum[i] = kor[i] + eng[i] + mat[i];
			
			// 4. 평균을 구하자.
			avg[i] = sum[i] / 3.0f;
			
			// 5. 학점을 구하자.
			if(avg[i] >= 90) {
				grade[i] = "A학점";
			} else if(avg[i] >= 80) {
				grade[i] = "B학점";
			} else if(avg[i] >= 70) {
				grade[i] = "C학점";
			} else if(avg[i] >= 80) {
				grade[i] = "D학점";
			} else {
				grade[i] = "F학점";
			}
		}
		
		
		// 6. 순위를 구하자.
		// 모든 학생은 본인이 1등이라고 한다.
		for(int i = 0; i < rank.length; i++) {
			rank[i] = 1;
		}
		for(int i = 0; i < rank.length; i++) {
			for(int j = 0; j < rank.length; j++) {
				if(sum[i] < sum[j]) {
					rank[i]++;	//내 등수가 하나 ++
				}
			}
		}
		
		// 7. 화면에 출력을 하자. - 성적 출력
		for(int i = 0; i < rank.length; i++) {
			System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
			System.out.print("\t이름 : " + name[i] + "\t");
			System.out.print("총점 : " + sum[i] + "점\t");
			System.out.printf("평균 : %/.2f점\t" , avg[i]);
			System.out.print("학점 : " + grade[i] + "\t");
			System.out.print("석차 : " + rank[i] + "등\n");
		}
	} 

}
