package chap4;

import java.util.Scanner;

/*
 * ���� ���ϱ�
 * ������ 4�� ��� �� 100�� ����� ���� ���, 100�� ����� �ƴ� ���� ����,
 * �� 400�� ����� ����.
 * �⵵�� �Է¹޾Ƽ� ����, ��� ������ ����ϱ�
 * [���]
 * �⵵�� �Է��ϼ���
 * 2020
 * ����
 * 
 * �⵵�� �Է��ϼ���
 * 2100
 * ���
 * */
public class Exam3 {

	public static void main(String[] args) {
		System.out.println("���ڸ� �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();

		if (year % 4 == 0) {
			if (year % 400 == 0) {
				System.out.println("����");
			} else if (year % 100 == 0) {
				System.out.println("���");
			} else
				System.out.println("����");
		} else {
			System.out.println("���");
		}
		/*
		 * if(year%4==0) { if(year%400==0 || year%100 !=0) { System.out.println("����");
		 * }else { System.out.println("���"); } else { System.out.println("���"); } }
		 * 
		 * 
		 */

	}

}
