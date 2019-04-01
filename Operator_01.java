package day_02;

// 연산자
// 연산자는 자바 언어에서 사용할 수 있는 기호들의 정의
// ex) +,-,/,*,%,<,=<&
// 연산자에 대입되는 피연산자와 연산자의 반환값을 확인해야 합니다.


public class Operator_01 {

	public static void main(String[] args) {
		// 산술연산자
		// +,-,*,/,%
		int n1 = 10;
		int n2 = 7;
		int result;
		
		result = n1 + n2;
		System.out.printf("%d %c %d = %d\n ", n1, '+',n2, result);
		
		result = n1 - n2;
		System.out.printf("%d %c %d = %d\n ", n1, '-',n2, result);
		result = n1 * n2;
		System.out.printf("%d %c %d = %d\n ", n1, '*',n2, result);
		result = n1 / n2;
		System.out.printf("%d %c %d = %d\n ", n1, '/',n2, result);
		System.out.printf("%d %c %d = %f\n ", n1, '/',n2, (float)n1 / n2);
	
		//%는 나머지연산자
		// 짝수 / 홀수 판단, 배수 판단
		result = n1 % n2;
		System.out.printf("%d %c %d = %d\n ", n1, '/',n2, result);
		
		// 정수와 정수의 산술 연사이 일어나면 반환되는 값은 int 타입이 됩니다. 아래와 같이 byte, short 타입의 변수에
		// 산술연산의 결과를 대입받는 경우 컴파일 에러가 발생합니다.
		byte b1 = 10;
		byte b2 = 5;
		// 아래와 같이 연산의 결과를 변경하여 대입할 수 있다.
		byte b3 = (byte) (b1 + b2);
		
		
	}

}
