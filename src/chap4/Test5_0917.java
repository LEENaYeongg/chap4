package chap4;

import java.util.Scanner;

//ȭ�鿡 �ﰢ�� ���̸� �Է¹ް�, ���̿� �´� *�� �ﰢ�� ����ϱ� (�̵ �ﰢ�� ���)
public class Test5_0917 {
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
			for (int j = 1; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// ������ �ҽ�
		
		System.out.println("�ﰢ���� ���̸� �Է��ϼ���.");
		Scanner scan1 = new Scanner(System.in);
		int len = scan1.nextInt();
		int bottom = len * 2 - 1;
		int m = bottom/2;
		for ( int i = 0; i<len; i++) {
			for(int j=0; j<bottom; j++) {
				if(j>m-i && j<=m+i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}

