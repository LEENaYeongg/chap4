package chap4;

/*
 * 1���� 100���� ¦���� �� ���ϱ�
 * 
 * */
public class Exam4 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0)
				sum += i;
		}
		System.out.println("1���� 100������ ¦���� ��(for��) : " + sum);
		sum = 0;
		for (int i = 0; i <= 100; i += 2) {
			sum += i;
		}
		System.out.println("1���� 100������ ¦���� �� : " + sum);

		sum = 0;
		int i = 0;
		while (i <= 100) {
			sum += i;
			i += 2;
		}
		System.out.println("1���� 100������ ¦���� �� : " + sum);

		sum = 0;
		i = 0;
		do {
			sum += i;
			i += 2;
		} while (i <= 100);
		System.out.println("1���� 100������ ¦���� �� : " + sum);
	}
}
