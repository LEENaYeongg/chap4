package chap4;
/*
 * 시스템과 주사위 던지기

    시스템이 주사위를 던저 나온 값을 저장하고,
    사용자의 주사위를 던저 나온값을 시스템의 값과 비교하여, 시스템의 주사위 값이 크면 시스템 승리
    사용자의 주사위 값이 크면 사용자 승리
     시스템과 사용자의 주사위값이 같으면 동점입니다.
    출력하기. 


 * */
public class Test3 {

	public static void main(String[] args) {
		  int me = (int)(Math.random()*6)+1;
	      int com = (int)(Math.random()*6)+1;
	      
	      System.out.println("나의 주사위는 "+me+",컴퓨터의 주사위는 "+com+"입니다.");
	      
	      if (me>com) System.out.println("사용자 승리.");
	      else if (me==com) System.out.println("컴퓨터와 김.");
	      else System.out.println("사용자 패배.");

	}

}
