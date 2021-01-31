package chap4;
/*switch 구문의 조건값으로 사용 가능한 자료형
 * byte, short, int, char, String(String은 jdk7 이후)
 * 
 * 조건문 : if, switch
 * 	모든 switch 구문은 if 구문으로 변경이 가능하다.
 * 	모든 if 구문은 switch 구문으로 변경 할 수 없다. 이유: 자료형 제약, 값의 범위 제약
 * */
public class SwitchEx3 {

	public static void main(String[] args) {
		int value = 1; //double은 안됨, char은 됨.// String value = "";
		switch(value) {
		case 1 : System.out.println(value); break;
		default : System.out.println(value); break;
		}
	}
}
