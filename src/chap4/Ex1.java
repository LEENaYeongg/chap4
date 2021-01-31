package chap4;

import java.util.Scanner;

/*
 * if 조건문 예제
 * 
 * if(조건식) {
 * 문장들 <= 조건식의 결과가 참인 경우만 실행 문장
 * } else {
 * 문장들 <= 조건식의 결과가 거짓인 경우만 실행 문장
 * }
 * 
 * if(조건식1) {
 * 문장들 <= 조건식1의 결과가 참인 경우만 실행 문장
 * } else if(조건식2) {
 * 문장들 <= 조건식2의 결과가 참인 경우만 실행 문장
 * }
 * 문장들 <= 조건식의 결과가 참인 경우만 실행 문장
 * } else if(조건식3) {
 * 문장들 <= 조건식3의 결과가 참인 경우만 실행 문장
 * }
 * 
 * else {
 * 문장들 <= 조건식1,2,3 의 결과가 모두 거짓인 경우만 실행 문장
 * }
 * 
 * */
public class Ex1 {

	public static void main(String[] args) {
		System.out.println("점수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		if(score >= 60) {
			//if 구문에 실행되는 문장이 1개인 경우 {} 생략 가능.
			System.out.println("합격을 축하합니다.");
		} else { //if 구문이 있어야 사용 가능한 문장
			System.out.println("불합격 입니다.");
		}
		
		//90이상 A학점, 80이상 B학점...
		if(score>=90) {
			System.out.println("A학점");
		}else if(score>=80) {
				System.out.println("B학점");
			}
		else if(score>=70) {
			System.out.println("C학점");
		}
		else if(score>=60) {
			System.out.println("D학점");
		}
		else {
			System.out.println("F학점");
		}
	}

}
