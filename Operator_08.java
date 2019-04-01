package day_02;

public class Operator_08 {

	public static void main(String[] args) {
		// 시프트 연산자
		// 비트연산시트로서 특정 변수의 비트중 1인 자리를
		// 왼쪽 오른쪽으로 이동시키는 연산자
		// <<,>>
		
		int num = 10;
		
		// 레프트 쉬프트
		// 좌향의 비트 중 1인 자리의 우향의 값만큼 왼쪽으로 이동하는 명령
		// 좌항의 변수값에서 2의 n승만큼 곱한 결과를 돌려줍니다. 
		// 0 1 0 1 0
		// 1 0 1 0 0 // num *2의 1승을 곱한결과
		System.out.println(num << 1);


		// 라이트 쉬프트
		// 좌향의 비트 중 1인 자리의 우향의 값만큼 오른쪽으로 이동하는 명령
		// 좌항의 변수값에서 2의 n승만큼 나눈 결과를 돌려줍니다. 
		// 0 1 0 1 0
		// 0 0 1 0 1 // num *2의 1승을 나눈결과
		
		System.out.println(num >> 1);
		
		// 쉬프트 연산자는 피연산자의 값을 변경하지 않습니다.
		System.out.println(num);
		
		//대입 연산자를 사용하여 쉬프트한 결과를 대입
		// num = << 1;
		num <<= 1;
		System.out.println(num);
	
	}

}
