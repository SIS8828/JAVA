package day_02;

public class Operator_03 {

	public static void main(String[] args) {
		// 논리연산자
		// &&(and), !(not), ||(or)
		// 다수개의 관계식을 조합하여 하나의 부린 값을 반호나하는 연산자
		
		// AND 연산자 (&&)
		System.out.printf("%b %s %b = %b\n",
				false, "&&", false, false && false);
		System.out.printf("%b %s %b = %b\n",
				false, "&&", true, false && true);
		System.out.printf("%5b %s %5b = %b\n",
				true, "&&", false, true && false);
		System.out.printf("%5b %s %5b = %b\n",
				true, "&&", true, true && true);
		
		// or 연산자 (||)
		System.out.printf("%b %s %b = %b\n",
				false, "||", false, false || false);
		System.out.printf("%b %s %b = %b\n",
				false, "||", true, false || true);
		System.out.printf("%5b %s %5b = %b\n",
				true, "||", false, true || false);
		System.out.printf("%5b %s %5b = %b\n",
				true, "||", true, true || true);

		// NOT연산자(!)
		// 단항연산자(피연산자 1개)
		// 관계식 결과를 부정하여 반환
		// true ->false, false -> true
		
		System.out.printf("!%5b = %b\n",false, !false);
		System.out.printf("!%5b = %b\n",true, !true);
		
		int number = 18;
		
		// number 변수의 값이 짝수인 지를 확인하여 결과를 출력하세요 
		// true / false의 값을 출력
		boolean result = number % 2 == 0;
		System.out.printf("result = %b\n",result);
		
		//number 변수의 값이 짝수이면서 10보다 큰 값인지
		// 확인하면서 출력하셍
		// 참/거짓으로
		
		boolean result2 = number % 2 == 0 && number > 10 ;
		System.out.printf("result2 = %b\n",result2);
		
	}

}
