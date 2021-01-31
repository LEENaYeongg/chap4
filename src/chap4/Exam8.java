package chap4;

import java.util.Scanner;

/*
 * 문자열을 입력받아 숫자인 경우는 "숫자입니다."
 * 			      숫자가 아닌 경우는 "숫자가 아닙니다." 
 * 출력하기
 * 
 * */
public class Exam8 {

	public static void main(String[] args) {
		/* 나의 답 : 오류 나는데 나중에 해결해보기
		 * 		    선생님꺼랑 비교하면서!
		 * 
		 * Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		String str = sc.next();

		for (int i = 1; i <= str.length(); i++) {
			if (str.charAt(i)-'0' >= 0) //숫자표현하는 방법 //아스키코드에서 아스키코드를 뺀다고 숫자가 X
			//문자 0부터 9까지의 구간으로 해줘야함.
				break;
			System.out.println("숫자입니다.");
		}
		System.out.println("숫자가 아닙니다.");
		*/
		

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		String str = sc.next();
		boolean b = true; 
		int i=0; 
		for(i=0; i<str.length(); i++) {
			if(str.charAt(i) <'0' || str.charAt(i) > '9') {
				b= false;
				break;
			}
		}
		if(i>=str.length()) {
			System.out.println("숫자입니다.");
		}
		else
			System.out.println("숫자가 아닙니다.");
	}
	
}
