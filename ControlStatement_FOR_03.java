
public class ControlStatement_FOR_03 {

	public static void main(String[] args) {
		// 반복문 사용시 주의사항
		// 특정역역에서 선언된 변수는 
		// 해당영역의 실행이 종료되면 즉시 소멸되는 변수입니다.
		int outer = 10;
				
		// for문의 초기화 구문에서 생성된 inner변수는
		// 해당 for 문에서만 사용이 가능한 변수입니다.
		for(int inner = 1 ; inner <= 10 ; inner ++)
			System.out.printf("%d, %d\n", outer, inner);
		
		System.out.println("반복문 종료");
		
		// for문이 종료된 이후에는 for문에서 선언된
		// inner 변수를 사용할 수 없다. 
		
		// 동일한 이름의 변수는 생성할 수없다.
		// int outer = 20;
		
		// 위에 반복문에서 생성된 inner 변수는 이미 소멸된 상태이므로
		// 새로운 반복문에서 동일한 이름의 변수를 사용할 수 있습니다.
		for(int inner = 1 ; inner <= 10 ; inner ++)
			System.out.printf("%d, %d\n", outer, inner);
		
	}

}
