package chap4;

import java.util.Scanner;

/*
 * ���ڿ��� �Է¹޾� ������ ���� "�����Դϴ�."
 * 			      ���ڰ� �ƴ� ���� "���ڰ� �ƴմϴ�." 
 * ����ϱ�
 * 
 * */
public class Exam8 {

	public static void main(String[] args) {
		/* ���� �� : ���� ���µ� ���߿� �ذ��غ���
		 * 		    �����Բ��� ���ϸ鼭!
		 * 
		 * Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���");
		String str = sc.next();

		for (int i = 1; i <= str.length(); i++) {
			if (str.charAt(i)-'0' >= 0) //����ǥ���ϴ� ��� //�ƽ�Ű�ڵ忡�� �ƽ�Ű�ڵ带 ���ٰ� ���ڰ� X
			//���� 0���� 9������ �������� �������.
				break;
			System.out.println("�����Դϴ�.");
		}
		System.out.println("���ڰ� �ƴմϴ�.");
		*/
		

		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���");
		String str = sc.next();
		boolean b = true; 
		int i=0; 
		for(i=0; i<str.length(); i++) {
			if(str.charAt(i) <'0' || str.charAt(i) > '9') {
				b= false;
				break;
			}
		}
		if(i>=str.length()) {
			System.out.println("�����Դϴ�.");
		}
		else
			System.out.println("���ڰ� �ƴմϴ�.");
	}
	
}
