package chap4;

import java.util.Scanner;

/*
 * switch ���� ����
 * switch(���ǰ�(����, ����)) {
 * case ��1 : ����1; break;
 * case ��2 : ����2; break;
 * ...
 * default : ���� n;
 * }
 * break : switch ������ ���.
 * 
 * 
 * */
public class SwitchEx1 {

	public static void main(String[] args) {
		System.out.println("������ �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		String grade;
		switch (score / 10) {
		case 10: // 100 ���� A�� �ο��ϱ� ���� break�� ���� �ʰ� case 9�� ���� ����.
		case 9:
			grade = "A";
			break; // switch ������ break�� �������� �ȵȴ�. switch���� ���������� �ǹ�
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		case 6:
			grade = "D";
			break;
		default:
			grade = "F";
			break;
		}
		System.out.println(score + "����" + grade + "���� �Դϴ�.");

//switch ������ �̿��ؼ� 60�� �̻��̸� PASS, 60�� �̸��̸� FAIL�� ����ϱ�

		switch (score / 10) {
		case 10:
		case 9:
		case 8:
		case 7:
		case 6:
			System.out.println("PASS");
			break;
		default:
			System.out.println("FAIL");
			break;
		}

	}
}
