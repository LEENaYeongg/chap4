package chap4;

import java.util.Scanner;

// ȭ�鿡 �ﰢ�� ���̸� �Է¹ް�, ���̿� �´� *�� �ﰢ�� ����ϱ� (�������� �����ϴ� �ﰢ�� ���)

/*
 *   		  * (3.3) -> ù��° * ��ǥ
 *           ** (2.2) -> ù��° * ��ǥ
 *          *** (1.1) -> ù��° * ��ǥ
 *             ==> �� (i, j)�̸�  (i, i)���� (i, j)���� ��ǥ�� ���� �� �ִ�.
 * 
 * */
public class Test4_0917 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("�ﰢ���� ���̸� �Է��ϼ���.");
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
 * // ���� ���� �ҽ��� ���ʿ��� �����ϴ� �ﰢ�� ����̴�. ���� : ���ʿ��� ���� ������ �����ϱ� ����.
 * System.out.println("�ﰢ���� ���̸� �Է��ϼ���.");
      Scanner scan = new Scanner(System.in);
      int height = scan.nextInt();

      for (int i = 1; i <= height; i++) {
         System.out.println();
         for (int j = 1; j <= i; j++) {
            System.out.print("*");
         }
      }
 * */
