package practise;

import java.util.Scanner;

public class Problem03 {

	public static void main(String[] args) {
//		문제) 키보드로 학생 수와 이름, 국어점수, 영어점수, 수학점수
//	배열에 저장 후 총점, 평균, 학점, 석차 배열에 성적을
//	처리한 후 화면에 아래와 같이 출력되도록 하세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("학생 수를 입력하세요. : ");
		int student = sc.nextInt();
		String[] name = new String[student];
		int[] kor = new int[student];
		int[] eng = new int[student];
		int[] mat = new int[student];
		
		for(int i = 0; i < student; i++) {
			System.out.print("이름 입력 : ");
			name[i] = sc.next();
			System.out.print("국어점수 입력 : ");
			kor[i] = sc.nextInt();
			System.out.print("영어점수 입력 : ");
			eng[i] = sc.nextInt();
			System.out.print("수학점수 입력 : ");
			mat[i] = sc.nextInt();
		}
		
		int[] tot = new int[student];
		float[] avg = new float[student];
		String[] score = new String[student];
		int[] rank = new int[student];
		for(int i = 0; i < student; i++) {
			tot[i] = kor[i] + eng[i] + mat[i];
			avg[i] = tot[i]/3.0f;
			switch((int)avg[i] /10) {
			case 10 :
			case 9 :
				score[i] = "A학점";
				break;
			case 8 :
				score[i] = "B학점";
				break;
			case 7 :
				score[i] = "C학점";
				break;
			case 6 :
				score[i] = "D학점";
				break;
			default : 
				score[i] = "F학점";
				
			}
			
			rank[i] = tot[i];
		}
		
		int temp = 0;
		for(int i = 0; i < student; i++) {
			for(int j = i+1; j < student; j++) {
				if(rank[i] < rank[j]) {
					temp = rank[i];
					rank[i] = rank[j];
					rank[j] = temp;
				}
			}
		
		
		}
		
		
		int[] rank1 = new int[student];
		for(int i = 0; i < student; i++) {
			for(int j = 0; j < student; j++) {
				if(tot[i] == (rank[j])) {
					rank1[i] = (j+1);
			}
			
			}
			
		}
		
		
		for(int i = 0; i < student; i++) {
			System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
			System.out.print("이름 : " + name[i] + "\t");
			System.out.print("총점 : " + tot[i] + "점" + "\t");
			System.out.printf("평균 : %.2f점\t", avg[i]);
			System.out.print("학점 : " + score[i] + "\t");
			System.out.println("순위 : " + rank1[i] + "등");
		}
		
		
	
		
		sc.close();
		
	}

}
