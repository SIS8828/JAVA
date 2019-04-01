package day_02;

// 제어문
// 실행문의 흐름을 제어할 수 있는 문법
// 1. 분기문
// - 조건의 결과에 따라서 실행문의 실행을 제어하는 문법
// - if, switch
// 2. 반복문
// - 조건의 결과에 따라서 실행문의 반복 실행을 제어할 수 있는 문법
// - for, while, do ~ while

//if 문
// 조건식을 기준으로 참일 경우와 거짓일 경우의 실행을 분기할 수 있는 문법
// 상향연산자는 값의 분기, if문은 실행문의 실행 여부를 분기
// if (조건식 - 참과 거짓으로 분리된 식)
// if문의 조건식이 참일경우 실행할 실행문
public class ControlStatement_IF_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number ;
		number = 17;
		
		if(number % 2 ==0)
			System.out.println("짝수입니다.");
		if(number % 2 ==1)
			System.out.println("홀수입니다.");
		
		//주민등록번호의 7번째 자리의 정수
		int gender = 4;
		
		//if 문을 사용하여 남자/여자를 출력하세요
		if(gender == 2 || gender == 4)
			System.out.println("여자입니다.");
		if(gender == 1 || gender == 3)
			System.out.println("남자입니다.");
		
		
		
		
		
	}

}
