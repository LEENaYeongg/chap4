package chap4;

import java.util.Scanner;

/*
 * if ���ǹ� ����
 * 
 * if(���ǽ�) {
 * ����� <= ���ǽ��� ����� ���� ��츸 ���� ����
 * } else {
 * ����� <= ���ǽ��� ����� ������ ��츸 ���� ����
 * }
 * 
 * if(���ǽ�1) {
 * ����� <= ���ǽ�1�� ����� ���� ��츸 ���� ����
 * } else if(���ǽ�2) {
 * ����� <= ���ǽ�2�� ����� ���� ��츸 ���� ����
 * }
 * ����� <= ���ǽ��� ����� ���� ��츸 ���� ����
 * } else if(���ǽ�3) {
 * ����� <= ���ǽ�3�� ����� ���� ��츸 ���� ����
 * }
 * 
 * else {
 * ����� <= ���ǽ�1,2,3 �� ����� ��� ������ ��츸 ���� ����
 * }
 * 
 * */
public class Ex1 {

	public static void main(String[] args) {
		System.out.println("������ �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		if(score >= 60) {
			//if ������ ����Ǵ� ������ 1���� ��� {} ���� ����.
			System.out.println("�հ��� �����մϴ�.");
		} else { //if ������ �־�� ��� ������ ����
			System.out.println("���հ� �Դϴ�.");
		}
		
		//90�̻� A����, 80�̻� B����...
		if(score>=90) {
			System.out.println("A����");
		}else if(score>=80) {
				System.out.println("B����");
			}
		else if(score>=70) {
			System.out.println("C����");
		}
		else if(score>=60) {
			System.out.println("D����");
		}
		else {
			System.out.println("F����");
		}
	}

}
