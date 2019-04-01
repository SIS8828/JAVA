
public class Variable_03_LifeCycle {

	public static void main(String[] args) {
		// HEAP 메모리
		// 프로그램의 구동된 이후에  동적 변수들이 저장되는 메모리 공간
		// - new 연산자를 통해서 생성되는 변수들을 저장하는 메모리 영역
		
		// 1. 동적 메모리를 저장 (배열, 클래스의 객체...)
		// 2. 초기화가 지원( 일반 변수는 0으로, reference 변수는 null 값으로 초기화)
		// 3. 자동 해제를 지원 (단 시기는 ...???)
		// garbage collector 를 동작시키는 코드
		// System.gc();
		// - 메모리가 수거되는 시점은 해당 메모리를 어떠한 레퍼런스 변수를
		// 	 참ㅈ하고 있지 않은 경우에 수거합니다.
		
		/*
		// 메소드 내부에 선언된 변수 (지역변수)
		// 메소드의 매개변수도 STACK 메모리에 생성도비니다.
		
		int num;
		// 스택메모리에 선언된 변수는 초기화 이후에만 사용이 가능하다. 
		// System.out.println(num);
		num = 10;
		System.out.println(num);
		*/
		
		//Heap 메모리를 사용하는 방법
		// new 연산자를 사용하여 메모리 공간을 할당
		// 레퍼런스변수명 = new 생성할다입();
		// String 클래스 타입의 msg_1 변수에 Heap 메모리 영역을
		// 할당하는 코드
		// - 레퍼런스 변수 : Heap 메모리를 저장된 데이터를 참조하는 변수
		// (레퍼런스 변수는 실제 데이터를 저장하지 ㅇ낳고, 데이터가 위치하고 있는
		// 위치값(래퍼런스/참조)를 저장하는 변수입니다.
		String msg_1 = new String("Hello");
		String msg_2 = new String("Hello");
		System.out.printf("msg1-> %s, msg2-> %s\n", msg_1, msg_2);
		
		// 레퍼런스변수는 동일한 값을 가지고 있지만
		// 서로 생성된 위치가 다르기 때문에 == 연간으로는 false가 반환됩니다. 
		System.out.println(msg_1 == msg_2);
		
		// Heap 메모리에 생성된 데이터는 어떠한 레퍼런스 변수들도 참조하지 않는 경구
		// GC에 의해 자동 수거딥니다.
		
		// 참고
		// 레퍼런스 변수는 초기화를 위해서 null값을 사용할 수 있습니다.
		// null 값은 어떠한 위치도 참조하고 있지 않다라는 의미의 값
		// 0이 아님, null 같은 비교에도 사용될수 있는 값
		String msg = null;
		if( msg == null)
			System.out.println("null값을 가지고 있습니다.");
		else
			System.out.println("데이터를 참조하고 있다.");
	}

}
