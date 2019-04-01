// 제어문의 복합된사용
// 반복문 내부의 분기문
// 제어문은 서로 다른 제어문 내부에 포함되어 작성될 수 있습니다.
public class ControlStatement_FOR_01 {

	public static void main(String[] args) {
		
		// 1~ 10까지의 정수중 짝수만 출력하세요
		for (int i = 1 ; i <= 10 ; i++)
			if( i % 2 == 0)
				System.out.printf("i = %d\n", i);

		// for 문의 특징을 활용한 짝수 출력방법
		// 증감식에서 대입연산자를사용하여 값을 수정할 수 있습니다.
		for (int j = 2 ; j <= 10 ; j += 2)
			System.out.printf("j = %d\n", j);
		
	}

}
