package day_02;

public class ControlStatement_IF_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//if ~ else 구문
		// if(조건식)
		//     조건식이 참일경우 실행문 ;
		// else
		// 		조건식이 거짓일 경우 실행문 ;
		int number ;
		number = 17;
		
		if(number % 2 ==0)
			System.out.println("짝수입니다.");
		else
			System.out.println("홀수입니다.");
		
		int gender = 4;
		
		if(gender == 2 || gender == 4)
			System.out.println("여자입니다.");
		else
			System.out.println("남자입니다.");
	}

}
