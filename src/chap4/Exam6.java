package chap4;

import java.util.Scanner;

/*
 * ���ڷ� �̷���� ���ڿ��� �Է¹޾� �� �ڸ����� ���� ���ϱ�
 * String str = scan.next(); 1234
 * str.lenth() : 3
 * str.charAt(0) : 1
 * str.charAt(1) : 2
 * str.charAt(2) : 3
 * 1 + 2 + 3 = 6
 * 
 *  ====> ���� ������ �˰���
 *  1. ���ڸ� �Է¹��� �� for���� ����ؼ� �� �ڸ��� ���ڸ� i++�� ����ִ´�.
 *  2. �Է¹��� ���ڸ�  i=1���� �Ѱ��� �����ϸ鼭 ���Ѵ�.
 *  ���⼭ �ǹ�! �Է¹��� ���ڸ� ��� i�� ���� ���̳�.. �迭�� �ƴϱ�..
 *           ==> 
 *
 * */
public class Exam6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���");
		String str = sc.next();

		int sum = 0;
		for (int i = 1; i < str.length(); i++) {
			sum += str.charAt(i) - '0';
		}

		System.out.println(str + "�� �ڸ��� ��" + sum);
	}

}
