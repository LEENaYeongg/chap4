package chap4;
//(1) + (1+2) + (1+2+3)+... (1+2+3+...10)=220 ����ϱ�

/*
 * ���� �˰���
 * 1���� 10���� 1�� ����.
 * 1���� 10���� ���� ���Ѵ�.
 * 
 * */
public class Test3_0917 {

	public static void main(String[] args) {
		int sum = 0;

		for (int i = 1; i <= 10; i++) {
			System.out.print("(");
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
				if (j < i)
					System.out.print("+");
				sum += j;
			}
			System.out.print(")");
			if (sum == 220) {
				System.out.println("=");
				break;
			}
			System.out.print("+");
		}
		System.out.println(sum);
		
		//������ �ҽ�
		int sum1 = 0;
		for (int i =1; i<=10; i++) {
			System.out.println("(");
			for ( int j = 1; j <=i; i++) {
				System.out.println(j + ((j == i) ? "" : "+"));
				sum1 += j;
			}
			System.out.println(")" + ((i == 0) ? "+" : "+"));
		}
		System.out.println(sum1);
	}
}

