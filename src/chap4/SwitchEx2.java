package chap4;

public class SwitchEx2 {

	public static void main(String[] args) {
		int num = (int)(Math.random() * 10) + 1;
		/*Math.random() : 0 <= x <1.0 ������ ��(����) ����
		* Math.random() * 10 : 0 <= x * 10 <10.0
		* (int)Math.random() * 10 :
		* 		0 <= (int)(x * 10) < 10 : 0 ~9 ������ ��
		* 		1 <= (int)((x * 10) < 10) + 1 <= 10
		*
		*/
		
		//num : 1���� 10 ������ ������ ��
		switch(num) {
		case 1 : System.out.println("�����մϴ�. �����ſ� ��÷�Ǿ����ϴ�.");
		break;
		case 2: System.out.println("�����մϴ�. USB�� ��÷�Ǿ����ϴ�.");
		break;
		case 3 : System.out.println("�����մϴ�. Ű���忡 ��÷�Ǿ����ϴ�.");
		break;
		default : // 4~10
		System.out.println("�ƽ����ϴ�. ���� ��ȸ��");
	
		}

	}

}
