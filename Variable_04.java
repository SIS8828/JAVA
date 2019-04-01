package day_02;

public class Variable_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//다양한 타입의 변수 초기화 방법
		// 문자타입
		// 문자타입 : 하나의 글자
		// 문자열과 구분하기 위하여 ''을 사용
		// (""은 문자열을 의미)
		char ch = 'A';
		System.out.printf("ch -> %c\n",ch);
		System.out.printf("ch -< %d\n", (int)ch);
		//문자의 정수값을 추출하기 위해서 형변환
		// 형변환 : 데이터 타입을 변경하는 연산
		//System.out.println("A-> %d, a -> %d\n, (int)'A',(int)'a'");
		
		//대소문자 변환
		// 대문자 A 값에 32를 더하여 소문자 a로 변경
		
		System.out.printf("ch -> %c\n", ch + 32);
		// 소문자 a와 대문자 A 사이의 간격을 꼐산형 대문자를 소문자로 변경
		System.out.printf("ch -> %c\n", ch + ('a' - 'A'));
		
		// 실수형 변수의 초기화
		// 자바에서는 모든 실수를 double 타입으로 인지합니다.
		// 8byte로 처리
		// float 타입으로 실수르 저장하기 위해서 float 형 실수로 선언해야 합니다.
		// 실수값 f, 실ㅅ값 F -> 4byte 크기의 실수로 처리
		// 아래의 코드는 8byte 크기로 double형을 float 대입하는 코드 (에러)
		
		//float f = 1.1 ;
		// float f = 1.1F ;
		float f = (float)1.1;
		// 형변환을 사용한 float 타입 변수의 초기화
		
	}

}
