package chap4;

import java.util.Scanner;

/*������ �Է¹޾� 

    95�� �̻��� ��� A+ 90 ~ 94 : A0  
    89 ~ 85�� �̻��� ��� B+ 80 ~ 84 : B0 
    79 ~ 75�� �̻��� ��� C+ 70 ~ 74 : C0 
    69 ~ 65�� �̻��� ��� D+ 60 ~ 64 : D0 
    �׿ܴ� F �� ����ϱ�.

    ��ø ���ǹ��� �̿��Ͽ� �����ϱ�

*/
public class Test4 {

	public static void main(String[] args) {

		System.out.println("������ �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();

		if (score >= 95)
			System.out.println("A+ ����");
		else if (score >= 90 && score < 95)
			System.out.println("A0 ����");
		else if (score >= 85)
			System.out.println("B+ ����");
		else if (score >= 80 && score < 85)
			System.out.println("B0 ����");
		else if (score >= 75)
			System.out.println("C+ ����");
		else if (score >= 70 && score < 75)
			System.out.println("C0 ����");   

		
		else if (score >= 65)
			System.out.println("D+ ����");
		else if (score >= 60 && score < 65)
			System.out.println("D0 ����");
		else
			System.out.println("F����");

	}
}
