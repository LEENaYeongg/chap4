package chap4;

import java.util.Scanner;

/*
 * Ű���忡�� �Ѱ��� ���ڸ� �Է¹޾� �빮��, �ҹ���, ����, ��Ÿ�������� ����ϱ�
 * [���]
 * �Ѱ��� ���ڸ� �Է��ϼ���
 * A 
 * �빮��
 * 
 * �Ѱ��� ���ڸ� �Է��ϼ���
 * 6
 * ����
 * 
 * �Ѱ��� ���ڸ� �Է��ϼ���
 * -
 * ��Ÿ����
 * 
 * */
public class Exam2 {

	public static void main(String[] args) {
		
		System.out.println("�Ѱ��� ���ڸ� �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		char monja = scan.next().charAt(0); // 
		
		if (monja>='a'&&monja<='z') {
			System.out.println("�ҹ���");
		}
		else if(monja>='A'&&monja<='Z') {
			System.out.println("�빮��");
		}
		else if(monja>='0' | monja<='9') {
			System.out.println("����");
		}
		else
			System.out.println("��Ÿ����");
		

	}

}
