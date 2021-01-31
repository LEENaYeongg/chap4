package chap4;

import java.util.Scanner;

/*
 * 숫자로 이루어진 문자열을 입력받아 각 자리수의 합을 구하기
 * String str = scan.next(); 1234
 * str.lenth() : 3
 * str.charAt(0) : 1
 * str.charAt(1) : 2
 * str.charAt(2) : 3
 * 1 + 2 + 3 = 6
 * 
 *  ====> 내가 생각한 알고리즘
 *  1. 숫자를 입력받을 때 for문을 사용해서 각 자리의 숫자를 i++에 집어넣는다.
 *  2. 입력받은 숫자를  i=1부터 한개씩 증가하면서 더한다.
 *  여기서 의문! 입력받은 숫자를 어떻게 i로 받을 것이냐.. 배열도 아니구..
 *           ==> 
 *
 * */
public class Exam6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		String str = sc.next();

		int sum = 0;
		for (int i = 1; i < str.length(); i++) {
			sum += str.charAt(i) - '0';
		}

		System.out.println(str + "의 자리수 합" + sum);
	}

}
