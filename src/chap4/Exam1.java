package chap4;

import java.util.Scanner;

/*
 * 숫자를 입력받아서 양수인 경우는 "양수", 음수인 경우 "음수", 0인 경우 "영"을 출력하기
 * if 구문으로 구현하기
 * 
 * */
public class Exam1 {

	public static void main(String[] args) {

		System.out.println("숫자를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		if(num>0) {
			System.out.println("양수");
		}
		else if(num<0) {
			System.out.println("음수");
		}
		else
			System.out.println("영");
	
	
	if (num %2 ==0) {
		System.out.println("짝수");
	}
	
	else
		System.out.println("홀수");
	}
	

}
