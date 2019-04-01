
public class ControlStatement_FOR_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 중첩된 반복문을 활용한 구구단 출력예제
		// 외부의 반복문이 단수를 제어 (2~9)
		// 내부의 반복문은 곱해지는 수를 제어 (1~9)

		for (int i = 2; i < 10; i++) {
			
			// 중첩된 반복문의 실행 전에 구구단의 단수를 출력
			System.out.printf("<%d>단을 출력합니다.\n", i);
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d X %d = %d\n", i, j, i * j);
			}
			
			//중첩된 반복문의 실행 후에 개행
			System.out.println();
		}

	}

}
