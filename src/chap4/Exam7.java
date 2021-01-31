package chap4;

/*
 * 1부터 100까지 숫자 중 2의 배수도, 3의 배수도 아닌 수의 합을 구하기
 * 
 * */
public class Exam7 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0 && i % 3 == 0)
				continue;
			sum += i;
			// 첫번째 방법 )if (i % 2 == 0) continue;
			// if (i % 3 == 0) continue; // 두개를 같이 써도 되고 따로 써도 된다.

			// 두번째 방법)if (i % 2 != 0 && i % 3 != 0) //break와 continue를 쓰지 않고 !를 써서 아니면 더해라.
		}
		System.out.println(sum);
		sum = 0;
		int i = 0;
		while (true) {
			i++;
			if (i % 2 == 0)
				continue;
			if (i % 3 == 0)
				continue;
			if (i > 100)
				break;
			sum += i;
		}
		System.out.println(sum);
	}
}
