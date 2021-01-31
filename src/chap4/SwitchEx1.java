package chap4;

import java.util.Scanner;

/*
 * switch 구문 예제
 * switch(조건값(변수, 수식)) {
 * case 값1 : 문장1; break;
 * case 값2 : 문장2; break;
 * ...
 * default : 문장 n;
 * }
 * break : switch 구문을 벗어남.
 * 
 * 
 * */
public class SwitchEx1 {

	public static void main(String[] args) {
		System.out.println("점수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		String grade;
		switch (score / 10) {
		case 10: // 100 점에 A를 부여하기 위해 break를 넣지 않고 case 9의 값을 받음.
		case 9:
			grade = "A";
			break; // switch 문에서 break를 빼먹으면 안된다. switch문을 빠져나오는 의미
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		case 6:
			grade = "D";
			break;
		default:
			grade = "F";
			break;
		}
		System.out.println(score + "점은" + grade + "학점 입니다.");

//switch 구문을 이용해서 60점 이상이면 PASS, 60점 미만이면 FAIL을 출력하기

		switch (score / 10) {
		case 10:
		case 9:
		case 8:
		case 7:
		case 6:
			System.out.println("PASS");
			break;
		default:
			System.out.println("FAIL");
			break;
		}

	}
}
