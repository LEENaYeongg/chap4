package chap4;
/*
 * ������ 2x+4y=10�� ��� �ظ� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
   (�� x�� y�� �����̰� ������ ������ 0<=x<=10, 0<=y<=10��.)
   
   [���]
    x=1,y=2
	x=3,y=1
	x=5,y=0
 * 
 * */
public class Test2_0917 {

	public static void main(String[] args) {
		int x, y;

		for (x = 0; x < 10; x++) {
			for (y = 0; y < 10; y++) {

				int a = (2 * x) + (4 * y);

				if (a == 10)
					System.out.println("x=" + x + ", y=" + y);
			}
		}
	}
}
