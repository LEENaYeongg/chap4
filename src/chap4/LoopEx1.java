package chap4;

/*
 * �ݺ��� ����
 * */
public class LoopEx1 {

	public static void main(String[] args) {
		System.out.println("�ݺ��� ���� 1 ~ 5���� ���");
		System.out.print(1);
		System.out.print(2);
		System.out.print(3);
		System.out.print(4);
		System.out.println(5);
		
		System.out.println("for �������� 1 ~ 5���� ���");
		for (int i = 1; i <= 5; i++) //i�� for�������� ��� ������ ��������. �ٱ����� �� �� X
			System.out.print(i); // �ݺ����� ���� ������ �Ѱ��� ��� {} ���� ����
		System.out.println();
		
		System.out.println("while �������� 1 ~ 5���� ���");
		int i = 1;
		while (i <= 5) {
			System.out.print(i);
			i++;
		} //i�� 6�̵Ǹ� �������´�
		System.out.println();
		
		System.out.println("do while �������� 1 ~ 5���� ���");
		i = 1; //i�� 1�� �ʱ�ȭ.
		do {
			System.out.print(i); //i�� 1�� ���� ���
			i++;
		} while (i <= 5); //while������ ������ �Ǵ��ϰ� ���̸� �ٽ� do�� �����ϰ� �����̸� �Ѿ��.
		System.out.println();
	}
}
