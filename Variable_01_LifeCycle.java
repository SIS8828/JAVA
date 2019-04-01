
public class Variable_01_LifeCycle {

	public static void main(String[] args) {
		// 변수의 전기
		// 1. 전역변수
		// - 클래스의 멤버 변수
		// 2. 지역변수
		// - 메소드 내부에 선언된 모든 변수
		// - 지역변수가 선언된 메소드가 실행되는 시점에
		//	 메모리 로딩
		// - 지역변수가 선언되 메소드가 실행을 종료할 때
		// 	 메모리에서 소멸
		// 3. 지역변수 - 메소드 내부의 특정 영역 안에서 선언된 변수
		// - 메소드 내부의 특정 영역 안에서 선언된 변수
		// - 변수가 선언된 특정 영역이 실행될 때 메모리에 로딩
		// - 변수가 선언된 특정 영역이 종료될때 메모리에서 소멸
		
		
		// 지역변수의 선언
		// - 선언된 이후에는 해당 메소드 종료시점까지
		// 어디에서든 접근할 수 있습니다. 
		
		int localVariable = 10;
		
		System.out.printf("localVariable -> %d\n", localVariable);
		
		for( int innerLocalVariable = 1 ; innerLocalVariable < 3 ; innerLocalVariable++ )
			System.out.printf("localVariable -> %d\n", innerLocalVariable);
		
		// for 문이 종료하면서 사라진 변수라서 에러가 뜸
		
		//System.out.printf("localVariable -> %d\n", innerLocalVariable);
		
		// 지여겹ㄴ수 2의 사용시 주의사항
		while(true) {
			int innerLocalVariable = 1;
			// 특정 영역 내부에 선언된 변수는 해당 영역이 실행될 때
			// 변수가 생성됩니다.
			// 아래의 변수는 반복문이 실행될 때 마다 새롭게 생성
			System.out.printf("localVariable -> %d\n", innerLocalVariable);
			if (innerLocalVariable == 3)
				break ;
			
			innerLocalVariable++;
		}
		
		// 임시의 영역에 생성하여 지역변수 2를 사용하는 모습
		// 아래의 innerLocalVariable은 해당 영역이 종료되면
		// 메모리에서 소멸됩니다. 
		{
			int innerLocalVariable = 1;
			System.out.printf("localVariable -> %d\n", innerLocalVariable);
			
		}
		// System.out.printf("localVariable -> %d\n", innerLocalVariable);
		
	}

}
