
import java.util.Scanner;

public class ControlStatement_WHILE_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 사용자가 100을 입력할떄까지 계속해서 입력받는 프로그램을 작성하세요.
		
		
		// for문을 활용하여 무한루프를 처리
		// 초기호ㅘ, 조건식 ,증감식 부분을 비워둔다.
		for(;;) {
			System.out.print("정수를입력하세요 :");
			int input = sc.nextInt();
			if ( input == 100)
				break;
		}
		
		// while 일경우
		// 조건식 부분을 true 지정하여 처리합니다.
		while ( true ) {
			System.out.print("정수를입력하세요 :");
			int input = sc.nextInt();
			if ( input == 100)
				break;		}
		
		
	}

}
