package chap4;

import java.util.Scanner;

/*ȭ�鿡 �ﰢ�� ���̸� �Է¹ް�, ���̿� �´� *�� �ﰢ�� ����ϱ� (�𷡽ð� ���)
 * (�迭 ũ�⸦ Ȧ���� �Է��ϼ���)
 * 
 * �տ� �������� ������ *�� ����ϰ� ��Ģ�� ã�ƾ��Ѵ�.
 * �׸� �׷����鼭 �غ��� �ȴ�.
 * */
public class Test6_0917 {

	public static void main(String[] args) {
		System.out.println("�迭 ũ�⸦ Ȧ���� �Է��ϼ���: ");
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
