package chap4;

import java.util.Scanner;

/*
 * ȭ�鿡�� �ڿ����� �Է¹޾� ������ �ڸ����� ���� ���Ͻÿ�.
 * [���]
 * �ڿ����� �Է��ϼ���
 * 123
 * �ڸ��� �� : 6
 * 1+2+3=6
 * 
 * ===> for���� ���� ���� �� �𸣱� ������ while������ ó���ϴ� ���� �� ����.
 * 
 * ���� �����ϴ� �˰���
 * 1. 123%10 =3
 * 2. 123/10 =12 
 *        ==> 12%10 =2
 * 3. 12/10 =1 
 *       ==> 1%10 =1
 * 4. 1/10 =0 ==> 0�� ������ �տ� �� ���� ���ϰ� ����
 * */
public class Exam9 {

	public static void main(String[] args) {
		System.out.println("�ڿ����� �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int sum = 0;
		while (num > 0) {
			sum += num % 10;
			num /= 10;
		}
		System.out.println("�ڸ����� ��:" + sum);
		
		/* while(true) {
		 * sum += num % 10;
		 * num /= 10;
		 * if(num ==0) break;
		 * */
	}
}
