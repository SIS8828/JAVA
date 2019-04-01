
import java.util.Scanner;

public class ControlStatement_FOR_06 {

	public static void main(String[] args) {
		// 사용자가 100을 입력하면 프록르ㅐㅁ을 종료하세요.
		// 100을 입력하지 않으면 계속해서 입력을 요구합니다. 
		Scanner sc = new Scanner(System.in);
		// for문을 활용한 무한루프 코드
		// for 무느이 내부에서 break를 활용하지 않으면 종료되지 않은 반복문
		for (  ;  ;  ) {
			System.out.println("정수를 입력(100을 입력하면 프로그램 종료)");
			int temp = sc.nextInt();
			
			if( temp == 100)
				break;
		}
		
		System.out.println("프로그램종료");
	}

}
