package chap4;
/*
 * �ý��۰� �ֻ��� ������

    �ý����� �ֻ����� ���� ���� ���� �����ϰ�,
    ������� �ֻ����� ���� ���°��� �ý����� ���� ���Ͽ�, �ý����� �ֻ��� ���� ũ�� �ý��� �¸�
    ������� �ֻ��� ���� ũ�� ����� �¸�
     �ý��۰� ������� �ֻ������� ������ �����Դϴ�.
    ����ϱ�. 


 * */
public class Test3 {

	public static void main(String[] args) {
		  int me = (int)(Math.random()*6)+1;
	      int com = (int)(Math.random()*6)+1;
	      
	      System.out.println("���� �ֻ����� "+me+",��ǻ���� �ֻ����� "+com+"�Դϴ�.");
	      
	      if (me>com) System.out.println("����� �¸�.");
	      else if (me==com) System.out.println("��ǻ�Ϳ� ��.");
	      else System.out.println("����� �й�.");

	}

}
