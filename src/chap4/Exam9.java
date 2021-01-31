package chap4;

import java.util.Scanner;

/*
 * 화면에서 자연수를 입력받아 각각의 자리수의 합을 구하시오.
 * [결과]
 * 자연수를 입력하세요
 * 123
 * 자리수 합 : 6
 * 1+2+3=6
 * 
 * ===> for문은 언제 끝날 지 모르기 때문에 while문으로 처리하는 것이 더 나음.
 * 
 * 내가 생각하는 알고리즘
 * 1. 123%10 =3
 * 2. 123/10 =12 
 *        ==> 12%10 =2
 * 3. 12/10 =1 
 *       ==> 1%10 =1
 * 4. 1/10 =0 ==> 0이 나오면 앞에 수 전부 더하고 종료
 * */
public class Exam9 {

	public static void main(String[] args) {
		System.out.println("자연수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int sum = 0;
		while (num > 0) {
			sum += num % 10;
			num /= 10;
		}
		System.out.println("자리수의 합:" + sum);
		
		/* while(true) {
		 * sum += num % 10;
		 * num /= 10;
		 * if(num ==0) break;
		 * */
	}
}
