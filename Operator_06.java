package day_02;

public class Operator_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 대입연산자
		// 우항을 좌항에 대입한 후에 좌항의 값을 반환합니다.

		int num;
		num = 10;
		System.out.printf("num = %d\n", num);

		num = 10 + 5;
		System.out.printf("num = %d\n", num);

		// 대입 연산자는 우항의 값을 좌항에 대입한 후, 현재 위치에 좌항의 값을 반환 시킵니다.
		System.out.println(num = 77);

		// num 변수에 100을 곱한결과를 대입한 후 200 이상인지 확인하세요.
		/*
		 * num = num *100 ; boolean result = num >= 200 ; System.out.println(result);
		 * 
		 * System.out.println((num = num * 100)>= 200);
		 */

		System.out.println((num = num * 100) >= 200);

		// 변형된 형태의 대입연산자
		// 자기 자신에 대한 연산의 결과를 대입받는 경우
		// 중복되는변수의 이름을 생략할 수 있는 방법

		// num 변수의 값을 10증가하여 대입
		num = num + 10;
		num += 10;
		
		
		
	}

}
