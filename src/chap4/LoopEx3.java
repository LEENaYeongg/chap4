package chap4;
/*
 *  ��ø �ݺ��� : �ݺ��� ���ο� �ݺ����� ����
 *  
 *  ������ ���
 * */
public class LoopEx3 {

	public static void main(String[] args) {
		for(int i =2; i<=9; i++) { // i=2
			System.out.println("\n" + i + "��");
			for(int j=2; j<=9; j++) { // j=2
				System.out.println(i + "*" + j + "=" + (i*j));
			} //j�� 10�� �Ǹ� �ι�° for���� ��� ���� ��ȣ�� �Ѿ.
		}//i�� 9���Ǹ� ù��° for���� ��� ���� ��ȣ�� �Ѿ.
	}
}
