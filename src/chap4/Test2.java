package chap4;

import java.util.Scanner;

/*�ý��۰� ����(1), ����(2), ��(3)�� �ϱ�
    �ý����� 1,2,3 ���� �Ѱ��� ���ڸ� �����ϰ�, �Ѱ��� ���ڸ� �Է¹޾� ���������� �����ϱ�

 * */
public class Test2 {

	public static void main(String[] args) {
		int com = (int)(Math.random() * 3) + 1; 
		//0���� 1.0 ������ ���� ��Ÿ���Ƿ� 3������ ���� ���ϸ� *3
		//0���� �̹Ƿ� 1���� 3������ ��Ÿ������ +1
		System.out.println("�� ���� ���ڸ� �Է��ϼ��� ==> ����(1), ����(2), ��(3)");
		Scanner scan = new Scanner(System.in);
		int me = scan.nextInt();
		
		if (com == me) {
			System.out.println("���");
		}
		else if ((com>me && com-me!=2) || (com<me&&me-com==2)) {
			System.out.println("���� ��.");
		}
		else
			System.out.println("���� �̱�.");
	}
}

/*
 * 		int com = (int)(Math.random() * 3) + 1; 
		//0���� 1.0 ������ ���� ��Ÿ���Ƿ� 3������ ���� ���ϸ� *3
		//0���� �̹Ƿ� 1���� 3������ ��Ÿ������ +1
		System.out.println("�� ���� ���ڸ� �Է��ϼ��� ==> ����(1), ����(2), ��(3)");
		Scanner scan = new Scanner(System.in);
		int srp = scan.nextInt();
 * 
 * */
