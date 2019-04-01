
import java.util.Scanner;

public class ControlStatement_FOR_06_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 세과목의 성적을 입력받아 총점 ,평균을 계산하여 출력
		// 사용자가 종료를 원할 때까지 반복
		
		Scanner sc = new Scanner(System.in);
		
		for( ; ; ) {
			System.out.println("성적처리를 시작합니다.");
			System.out.print("1번째 성적을 입력하세요 : ");
			int n1 = sc.nextInt();
			System.out.print("2번째 성적을 입력하세요 : ");
			int n2 = sc.nextInt();
			System.out.print("3번째 성적을 입력하세요 : ");
			int n3 = sc.nextInt();

			int total = n1 + n2 + n3;
			double avg = (double) total/ 3;
			
			System.out.printf("총점 : %3d, 평균 : %.2f\n", total, avg);

			System.out.print( "프로그램을 종료하시겠습니다?(y/n) : ");
			// 문자열을 입력받은 Scanner 클래스의 next 메소드
			String strExit = sc.next();
			// 문자열의 시작 문자값을 추출 : char 타입이 반환 
			// 'y' 또는 'n' 반환
			char isExit = strExit.charAt(0);
			// 소문자 y or 대문자 Y가 입력된 경우 반복을 종료
			// 프로그램종료
			if (isExit == 'y' || isExit == 'Y')
				break;
		}
		
		System.out.println("프로그램 종료");
		
		
	}

}
