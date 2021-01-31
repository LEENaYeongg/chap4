package chap4;

/*
 * 반복문을 이용하여 1부터 10까지 합 구하기
 * */
public class LoopEx2 {

	public static void main(String[] args) {
		int sum=0, i=0;
		System.out.println("for 구문으로 합계 구하기");
		for(i=1;i<=10;i++) {
			sum += i;
		}
		System.out.println("1부터 10까지의 합: " + sum);
		
		System.out.println("while 구문으로 합계 구하기");
		
		sum=0; 
		i=1;
		while (i<=10) {
			System.out.println("1부터 10까지의 합: " + sum);
			i++;
		}
		System.out.println();
		
		System.out.println("do while 구문으로 합계 구하기");
		sum=0; 
		i=1;
		do {
			System.out.print("1부터 10까지의 합: " + sum);
			i++;
		} while (i<=10);
		System.out.println();
	}
}
