package chap4;

/*
 * 1���� 100���� ���� �� 2�� �����, 3�� ����� �ƴ� ���� ���� ���ϱ�
 * 
 * */
public class Exam7 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0 && i % 3 == 0)
				continue;
			sum += i;
			// ù��° ��� )if (i % 2 == 0) continue;
			// if (i % 3 == 0) continue; // �ΰ��� ���� �ᵵ �ǰ� ���� �ᵵ �ȴ�.

			// �ι�° ���)if (i % 2 != 0 && i % 3 != 0) //break�� continue�� ���� �ʰ� !�� �Ἥ �ƴϸ� ���ض�.
		}
		System.out.println(sum);
		sum = 0;
		int i = 0;
		while (true) {
			i++;
			if (i % 2 == 0)
				continue;
			if (i % 3 == 0)
				continue;
			if (i > 100)
				break;
			sum += i;
		}
		System.out.println(sum);
	}
}
