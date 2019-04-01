
public class PrintMethods {

	public static void main(String[] args) {

		// 자바 프로그램의 기본 출력 메소드
		// (System.ot 객체가 제공하는 메소드)
		// 기본 출력 기능은 프로그램의 흐름을 확인하기 위한 용도로
		// 빈번히, 에러 검출과 같은 기능을 수행할 때 사용
		
		// 1. print 메소드
		// 매개변수로 전달 받은 값을 출력
		// 자동 개행하지는 않음
		System.out.print("Hello ");
		// 개행문자 : \n
		// 개행문자가 사용되면 해당 위치에서 커서가 다음라인을 이동
		// \t 4칸이동 \b 백스페이스
		System.out.print("Wolrd/n");
		
		//println
		// 자동으로 개행한다.
		System.out.println("hello");
		System.out.println("world");

		//3. printf 메소드
		// (print format 메소드
		// printf("서식문자열", 값1,값2,...);
		// 서식문자열 내부에서 사용되는 서식 문자
		// %d : 10진수 정수의 값을 출력
		// %f : 부동소수점
		// %s : 문자열
		// %b ; 진리형
		// %c : 문자값 출력
		System.out.printf("%d + %d -> %d/n", 10, 5, 15);
		System.out.printf("오늘은 %d일 %d월 %c요일 입니다.", 2, 25, '월');
	}

}
