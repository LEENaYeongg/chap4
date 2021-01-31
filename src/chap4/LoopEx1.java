package chap4;

/*
 * 반복문 예제
 * */
public class LoopEx1 {

	public static void main(String[] args) {
		System.out.println("반복문 없이 1 ~ 5까지 출력");
		System.out.print(1);
		System.out.print(2);
		System.out.print(3);
		System.out.print(4);
		System.out.println(5);
		
		System.out.println("for 구문으로 1 ~ 5까지 출력");
		for (int i = 1; i <= 5; i++) //i는 for문에서만 사용 가능한 지역변수. 바깥에서 쓸 수 X
			System.out.print(i); // 반복문의 실행 구문이 한개인 경우 {} 생략 가능
		System.out.println();
		
		System.out.println("while 구문으로 1 ~ 5까지 출력");
		int i = 1;
		while (i <= 5) {
			System.out.print(i);
			i++;
		} //i가 6이되면 빠져나온다
		System.out.println();
		
		System.out.println("do while 구문으로 1 ~ 5까지 출력");
		i = 1; //i를 1로 초기화.
		do {
			System.out.print(i); //i에 1을 먼저 찍고
			i++;
		} while (i <= 5); //while문에서 조건을 판단하고 참이면 다시 do를 실행하고 거짓이면 넘어간다.
		System.out.println();
	}
}
