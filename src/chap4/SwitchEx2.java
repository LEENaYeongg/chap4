package chap4;

public class SwitchEx2 {

	public static void main(String[] args) {
		int num = (int)(Math.random() * 10) + 1;
		/*Math.random() : 0 <= x <1.0 임의의 수(난수) 리턴
		* Math.random() * 10 : 0 <= x * 10 <10.0
		* (int)Math.random() * 10 :
		* 		0 <= (int)(x * 10) < 10 : 0 ~9 임의의 수
		* 		1 <= (int)((x * 10) < 10) + 1 <= 10
		*
		*/
		
		//num : 1부터 10 사이의 임의의 수
		switch(num) {
		case 1 : System.out.println("축하합니다. 자전거에 당첨되었습니다.");
		break;
		case 2: System.out.println("축하합니다. USB에 당첨되었습니다.");
		break;
		case 3 : System.out.println("축하합니다. 키보드에 당첨되었습니다.");
		break;
		default : // 4~10
		System.out.println("아쉽습니다. 다음 기회에");
	
		}

	}

}
