package chap4;

// �������� 2������ ����ϱ�
public class Test1_0917 {

	public static void main(String[] args) {
		for (int i = 2; i <= 5; i++) {
			System.out.print(i + "��\t");
		}
		for (int i = 2; i <= 9; i++) {
			System.out.println();
			for (int j = 2; j <= 5; j++) {
				System.out.print(j + "x" + i + "=" + j * i + "\t");
			}

		}
		System.out.println("\n");
		for (int i = 6; i <= 9; i++) {
			System.out.print(i + "��\t");
		}
		for (int i = 2; i <= 9; i++) {
			System.out.println();
			for (int j = 6; j <= 9; j++) {
				System.out.print(j + "x" + i + "=" + j * i + "\t");
			}

		}
	}
}


/*
 * for(int k = 2; k<=9; k+=4) {
 * for(int i=0; i<4; i++){
 * System.out.println((i+k) + "��\t");
 * }
 * System.out.println();
 * for(int j = 2; j<=9; j++) {
 * for(int i=k; i<k + 4; i++){
 * System.out.println(i + "*" + j + "=" + i * j + "\t");
 * }
 * j + "x" + i + "=" + j * i + "\t"
 * }
 * j + "x" + i + "=" + j * i + "\t"
 * }
 * }
 * }
 * 
 * 
 * */
 