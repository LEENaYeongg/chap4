package chap4;

/*
 * break 	: 반복문, switch 구문 벗어남.
 * continue : 반복문의 처음으로 제어를 이동함.
 * 
 * */
public class LoopEx4 {

	public static void main(String[] args) {
		for (int i = 2; i <= 9; i++) {
			System.out.println("\n" + i + "단");
			for (int j = 2; j <= 9; j++) {
				// if (j == 5) break; //j=5일때 끝.
				   if (j == 5) continue; //j=5일때만 결과값이 안나옴.
				System.out.println(i + "*" + j + "=" + (i * j));
			}
		}
	}

}
