package chap4;

import java.util.Scanner;

/*
 * 화면에서 한개의 문자를 입력받아

     대문자인 경우는 소문자로, 
     소문자인 경우는 대문자로 
     숫자인 경우는 20을 더한 값을   출력하기
     그외의 문자는 기타 문자 를 출력하세요.

 * */
public class Test1 {

	public static void main(String[] args) {
		System.out.println("한개의 문자를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		String in = scan.next(); // 
		char ch = in.charAt(0);
		
		if (ch>='a' && ch<='z') {
			System.out.println((char)(ch-32)); //소문자와 대문자 아스키코드 차이가 32만큼 남.
		}
			else if (ch>='A' && ch<='Z') {
				System.out.println((char)(ch+32));
			}
			else if (ch>'0'&&ch<='9') { 
				System.out.println(ch -'0' +20); 
		}
			else System.out.println("기타문자");
	}

}

/*
 * 선생님 풀이
 * 
 * 		System.out.println("한개의 문자를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		String in = scan.next(); // 
		char ch = in.charAt(0);
		
		if (ch>='a' && ch<='z') {
			System.out.println((char)(ch-32)); //소문자와 대문자 아스키코드 차이가 32만큼 남.
		}
			else if (ch>='A' && ch<='Z') {
				System.out.println((char)(ch+32));
			}
			else if (ch>'0'&&ch<='9') { 
				System.out.println((ch -'0') +20); // 
				==> ch는 아스키 코드이기 때문에 한 개 작은 아스키코드의 문자를 빼주면 그 아스키코드의 숫자가 되서 숫자를 더할 수 있음.
		}
			else System.out.println("기타문자");
 * 
 * 
 * */
