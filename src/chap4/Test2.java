package chap4;

import java.util.Scanner;

/*시스템과 가위(1), 바위(2), 보(3)를 하기
    시스템은 1,2,3 중의 한개의 숫자를 저장하고, 한개의 숫자를 입력받아 가위바위보 게임하기

 * */
public class Test2 {

	public static void main(String[] args) {
		int com = (int)(Math.random() * 3) + 1; 
		//0부터 1.0 까지의 수를 나타내므로 3까지의 수를 원하면 *3
		//0부터 이므로 1부터 3까지를 나타내려면 +1
		System.out.println("한 개의 숫자를 입력하세요 ==> 가위(1), 바위(2), 보(3)");
		Scanner scan = new Scanner(System.in);
		int me = scan.nextInt();
		
		if (com == me) {
			System.out.println("비김");
		}
		else if ((com>me && com-me!=2) || (com<me&&me-com==2)) {
			System.out.println("내가 짐.");
		}
		else
			System.out.println("내가 이김.");
	}
}

/*
 * 		int com = (int)(Math.random() * 3) + 1; 
		//0부터 1.0 까지의 수를 나타내므로 3까지의 수를 원하면 *3
		//0부터 이므로 1부터 3까지를 나타내려면 +1
		System.out.println("한 개의 숫자를 입력하세요 ==> 가위(1), 바위(2), 보(3)");
		Scanner scan = new Scanner(System.in);
		int srp = scan.nextInt();
 * 
 * */
