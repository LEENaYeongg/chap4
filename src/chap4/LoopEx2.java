package chap4;

/*
 * �ݺ����� �̿��Ͽ� 1���� 10���� �� ���ϱ�
 * */
public class LoopEx2 {

	public static void main(String[] args) {
		int sum=0, i=0;
		System.out.println("for �������� �հ� ���ϱ�");
		for(i=1;i<=10;i++) {
			sum += i;
		}
		System.out.println("1���� 10������ ��: " + sum);
		
		System.out.println("while �������� �հ� ���ϱ�");
		
		sum=0; 
		i=1;
		while (i<=10) {
			System.out.println("1���� 10������ ��: " + sum);
			i++;
		}
		System.out.println();
		
		System.out.println("do while �������� �հ� ���ϱ�");
		sum=0; 
		i=1;
		do {
			System.out.print("1���� 10������ ��: " + sum);
			i++;
		} while (i<=10);
		System.out.println();
	}
}