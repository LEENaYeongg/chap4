package chap4;

import java.util.Scanner;

/*화면에 삼각형 높이를 입력받고, 높이에 맞는 *로 삼각형 출력하기 (모래시계 모양)
 * (배열 크기를 홀수로 입력하세요)
 * 
 * 앞에 시작점과 끝점을 *로 출력하고 규칙을 찾아야한다.
 * 그림 그려가면서 해보면 된다.
 * */
public class Test6_0917 {

	public static void main(String[] args) {
		System.out.println("배열 크기를 홀수로 입력하세요: ");
		Scanner scan = new Scanner(System.in);
		int len = scan.nextInt();
		for (int i = 0; i <= len / 2; i++) {
			for (int j = 0; j < len - i; j++) {
				if (j < i)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}
		for (int i = len / 2 + 1; i < len; i++) {
			for (int j = 0; j <= i; j++) {
				if (j >= len - i - 1 && j <= i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
