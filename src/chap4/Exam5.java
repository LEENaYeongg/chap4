package chap4;
// �������� �ܸ��� ���η� ���

public class Exam5 {

	public static void main(String[] args) {
		for (int i = 2; i <= 9; i++) {
			System.out.print("  " + i + "��" + "\t");
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
