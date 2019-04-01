
public class Variable_02_LifeCycle {

	public static void main(String[] args) {
		// STACK 메모리
		// 프로그램의 구동중에 정적 변수들이 저장되는 메모리 공간
		// 1. 지역번수가 저장되는 공간
		// 2. 메소드가 실행될 때 사용하는 공간
		// 3. 초기화가 지원되지 않습니다. (스레기값을 가지고 생성됨)
		// 4. 반드시 초기화 이후에 변수를 사용할 수 있습니다. 
		// 5. 자동 해제되는 메모리 공간(메소드의 종료 시 메모리에서 자동 해제)
		
		// 메소드 내부에 선언된 변수 (지역변수)
		// 메소드의 매개변수도 STACK 메모리에 생성도비니다.
		
		int num;
		// 스택메모리에 선언된 변수는 초기화 이후에만 사용이 가능하다. 
		// System.out.println(num);
		num = 10;
		System.out.println(num);
	}

}
