package chap4;
/*
 *  중첩 반복문 : 반복문 내부에 반복문이 존재
 *  
 *  구구단 출력
 * */
public class LoopEx3 {

	public static void main(String[] args) {
		for(int i =2; i<=9; i++) { // i=2
			System.out.println("\n" + i + "단");
			for(int j=2; j<=9; j++) { // j=2
				System.out.println(i + "*" + j + "=" + (i*j));
			} //j가 10이 되면 두번째 for문을 벗어나 다음 괄호로 넘어감.
		}//i가 9가되면 첫번째 for문을 벗어나 다음 괄호로 넘어감.
	}
}
