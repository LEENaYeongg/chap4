package chap4;
// 구구단을 단마다 세로로 출력

public class Exam5 {

	public static void main(String[] args) {
		for (int i = 2; i <= 9; i++) {
			System.out.print("  " + i + "단" + "\t");
		}
		System.out.println();
		for (int j = 2; j <= 9; j++) {
			for (int i = 2; i <= 9; i++) {
				System.out.print(i + "*" + j + "=" + (i * j) + "\t");
			}
			System.out.println();
		}
	}
}
