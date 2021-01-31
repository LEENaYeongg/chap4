package chap4;

import java.util.Scanner;

/*
 * 키보드에서 한개의 문자를 입력받아 대문자, 소문자, 숫자, 기타문자인지 출력하기
 * [결과]
 * 한개의 문자를 입력하세요
 * A 
 * 대문자
 * 
 * 한개의 문자를 입력하세요
 * 6
 * 숫자
 * 
 * 한개의 문자를 입력하세요
 * -
 * 기타문자
 * 
 * */
public class Exam2 {

	public static void main(String[] args) {
		
		System.out.println("한개의 문자를 입력하세요");
		Scanner scan = new Scanner(System.in);
		char monja = scan.next().charAt(0); // 
		
		if (monja>='a'&&monja<='z') {
			System.out.println("소문자");
		}
		else if(monja>='A'&&monja<='Z') {
			System.out.println("대문자");
		}
		else if(monja>='0' | monja<='9') {
			System.out.println("숫자");
		}
		else
			System.out.println("기타문자");
		

	}

}
