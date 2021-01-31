package chap4;

import java.util.Scanner;

// 화면에 삼각형 높이를 입력받고, 높이에 맞는 *로 삼각형 출력하기 (오른에서 시작하는 삼각형 모양)

/*
 *   		  * (3.3) -> 첫번째 * 좌표
 *           ** (2.2) -> 첫번째 * 좌표
 *          *** (1.1) -> 첫번째 * 좌표
 *             ==> 즉 (i, j)이면  (i, i)부터 (i, j)까지 좌표를 찍을 수 있다.
 * 
 * */
public class Test4_0917 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("삼각형의 높이를 입력하세요.");
		int height = scan.nextInt();
		for (int i = 0; i < height; i++) {
			for (int j = height - i - 1; j > 0; j--) {
				System.out.print(" ");
			}
			for (int f = 0; f < i + 1; f++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

/*
 * // 내가 만든 소스는 왼쪽에서 시작하는 삼각형 모양이다. 이유 : 왼쪽에서 부터 나열을 시작하기 때문.
 * System.out.println("삼각형의 높이를 입력하세요.");
      Scanner scan = new Scanner(System.in);
      int height = scan.nextInt();

      for (int i = 1; i <= height; i++) {
         System.out.println();
         for (int j = 1; j <= i; j++) {
            System.out.print("*");
         }
      }
 * */
