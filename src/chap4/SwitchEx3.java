package chap4;
/*switch ������ ���ǰ����� ��� ������ �ڷ���
 * byte, short, int, char, String(String�� jdk7 ����)
 * 
 * ���ǹ� : if, switch
 * 	��� switch ������ if �������� ������ �����ϴ�.
 * 	��� if ������ switch �������� ���� �� �� ����. ����: �ڷ��� ����, ���� ���� ����
 * */
public class SwitchEx3 {

	public static void main(String[] args) {
		int value = 1; //double�� �ȵ�, char�� ��.// String value = "";
		switch(value) {
		case 1 : System.out.println(value); break;
		default : System.out.println(value); break;
		}
	}
}
