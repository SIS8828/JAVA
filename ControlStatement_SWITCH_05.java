// 반복문
// for, while, do~while
// 특정 영역의 실행문을 반복해서 실행할 수 있는 문법

// for 반복문
// - 기준변수의 값을 조건식의 기준으로 활용하여 
//   반복을 수행하는 문법
// for( 초기화식 ; 조건식; 증감식 )
//	 	반복해서 실행할 문장;
// 실행과정
// 1. 초기화식(for문의 시작 시 최초의 단 한번만 실행)
// 2. 조건식
// 3-1 조건식이 참인 경우 실행문을 실행
// 3-2 조건식이 거짓인 경우 실행문을 실행
// 4. 증감식으로 이동하여 초기화식에서 생성한 변수의 값을 제어(증가하거나 감소)
// 5. 조건식
public class ControlStatement_SWITCH_05 {

	public static void main(String[] args) {
		// 1~10 까지의 정수를 출력하세요.
		
		for( int i = 1 ; i <= 10 ; i++ )
			System.out.printf("i = %d\n", i);
		
		// 동일한 실행코드의 반복...
		/*
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		System.out.println(6);
		System.out.println(7);
		System.out.println(8);
		System.out.println(9);
		System.out.println(10);
		*/
	}

}
