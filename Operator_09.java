package day_02;

public class Operator_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 삼향연산자
		// 조건식에 다라서 값이나 식을 분기할 수 있는 연산자
		// 조건식 ? 조건이 참일 경우의 값, 수식 : 조건식이 거짓일 경우의 값, 수식
		// 조건식은 참과 거짓의 값을 반환할 수 있는 식
		// (관계, 논리 연산자를 조합하여 작성
		
		int number = 11;
		
		// String 타입의 변수는 문자열 값을 저장할 수 있다.
		String msg;
		msg = number % 2 == 0 ? "짝수" : "홀수";
		
		System.out.printf("%d 점수는 '%s' 입니다.\n",number,msg);
	}

}
