package chap4;

/*
 * break 	: �ݺ���, switch ���� ���.
 * continue : �ݺ����� ó������ ��� �̵���.
 * 
 * */
public class LoopEx4 {

	public static void main(String[] args) {
		for (int i = 2; i <= 9; i++) {
			System.out.println("\n" + i + "��");
			for (int j = 2; j <= 9; j++) {
				// if (j == 5) break; //j=5�϶� ��.
				   if (j == 5) continue; //j=5�϶��� ������� �ȳ���.
				System.out.println(i + "*" + j + "=" + (i * j));
			}
		}
	}

}
