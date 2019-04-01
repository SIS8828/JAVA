package day_02;

public class ControlStatement_IF_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// if문은 조건식이 참인경우
		// 하나의 실행 문을 실행 영역으로 지정합니다. 
		int number = 2;
		
		/*
		if ( number % 2 == 0 )
			// if문 이후에 선언된 하나으 ㅣ실행문 만이 if 문의 제어범위에 포함된다.
			System.out.printf("%d는 짝수입니다.1\n",number);
			// if문의 실행범위에 포함되지 않은 실행문
			//(항상 실행되는 실행문)
			System.out.printf("%d는 짝수입니다.2\n",number);
		*/
		
		// 만약 두줄이상의 실행문을 if 으로 처리하고자 하는 경우 
		// if문의 실행 영역을 지정하기 위해서 중괄호로 처리해야 합니다. 
		if (number % 2 == 0) {
			System.out.printf("%d는 짝수입니다.1\n",number);
			System.out.printf("%d는 짝수입니다.2\n",number);
			
		}
	}

}
