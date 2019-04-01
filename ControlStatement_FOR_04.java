
public class ControlStatement_FOR_04 {

	public static void main(String[] args) {
		// 1~100 가지 정수들의 합꼐
		// 1 + 2 + 3 + .. + 100 = ?
		
		// 반복문 내부에서 처리된 결과를 반복문의 종료 이후에
		// 사용하는 경우 해당 변수는 반드시 반복문의 외부에서 선언해야된다.
		int sum = 0;
		for(int i = 1; i <= 100 ; i++)
			// 0 + ~ + 100
			sum += i ;
		System.out.printf("sum -> %d\n", sum);
		/*
		// for 반복문의 초기화 구문에서
		// 다수개의 변수를 생성할 수 있습니다. 
		for(int i = 1, sum = 0; i <= 100 ; i++)
			// 0 + ~ + 100s
			sum += i ;
		// 값의 누적 정보를 저장하고 있는 변수가 반복문에서 
		// 선언된 경우 반복문의 외부에서 사용할 수 없다.
		System.out.printf("sum -> %d\n", sum);
		*/
		
	}

}
