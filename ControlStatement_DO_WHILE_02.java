
import java.util.Scanner;

public class ControlStatement_DO_WHILE_02 {

	public static void main(String[] args) {
		// do~while 반복물을 활용하여
		// 사용자가 100을 입력할 때 까지 반복해서 입력받으세요.
		
		Scanner sc = new Scanner(System.in);

		int input;
		do {
			System.out.print("숫자를 입력해주세요: ");
			input = sc.nextInt();
		} while( input != 100 ); // do~while반복문 조건식 이후 ;붙여야됨
		
		System.out.println("프로그램종료");
	}

}
