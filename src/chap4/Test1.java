package chap4;

import java.util.Scanner;

/*
 * ȭ�鿡�� �Ѱ��� ���ڸ� �Է¹޾�

     �빮���� ���� �ҹ��ڷ�, 
     �ҹ����� ���� �빮�ڷ� 
     ������ ���� 20�� ���� ����   ����ϱ�
     �׿��� ���ڴ� ��Ÿ ���� �� ����ϼ���.

 * */
public class Test1 {

	public static void main(String[] args) {
		System.out.println("�Ѱ��� ���ڸ� �Է��ϼ���.");
		Scanner scan = new Scanner(System.in);
		String in = scan.next(); // 
		char ch = in.charAt(0);
		
		if (ch>='a' && ch<='z') {
			System.out.println((char)(ch-32)); //�ҹ��ڿ� �빮�� �ƽ�Ű�ڵ� ���̰� 32��ŭ ��.
		}
			else if (ch>='A' && ch<='Z') {
				System.out.println((char)(ch+32));
			}
			else if (ch>'0'&&ch<='9') { 
				System.out.println(ch -'0' +20); 
		}
			else System.out.println("��Ÿ����");
	}

}

/*
 * ������ Ǯ��
 * 
 * 		System.out.println("�Ѱ��� ���ڸ� �Է��ϼ���.");
		Scanner scan = new Scanner(System.in);
		String in = scan.next(); // 
		char ch = in.charAt(0);
		
		if (ch>='a' && ch<='z') {
			System.out.println((char)(ch-32)); //�ҹ��ڿ� �빮�� �ƽ�Ű�ڵ� ���̰� 32��ŭ ��.
		}
			else if (ch>='A' && ch<='Z') {
				System.out.println((char)(ch+32));
			}
			else if (ch>'0'&&ch<='9') { 
				System.out.println((ch -'0') +20); // 
				==> ch�� �ƽ�Ű �ڵ��̱� ������ �� �� ���� �ƽ�Ű�ڵ��� ���ڸ� ���ָ� �� �ƽ�Ű�ڵ��� ���ڰ� �Ǽ� ���ڸ� ���� �� ����.
		}
			else System.out.println("��Ÿ����");
 * 
 * 
 * */
