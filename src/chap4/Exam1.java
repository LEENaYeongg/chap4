package chap4;

import java.util.Scanner;

/*
 * ���ڸ� �Է¹޾Ƽ� ����� ���� "���", ������ ��� "����", 0�� ��� "��"�� ����ϱ�
 * if �������� �����ϱ�
 * 
 * */
public class Exam1 {

	public static void main(String[] args) {

		System.out.println("���ڸ� �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		if(num>0) {
			System.out.println("���");
		}
		else if(num<0) {
			System.out.println("����");
		}
		else
			System.out.println("��");
	
	
	if (num %2 ==0) {
		System.out.println("¦��");
	}
	
	else
		System.out.println("Ȧ��");
	}
	

}
