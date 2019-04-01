
import java.util.Scanner;

public class ControlStatement_FOR_06_Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//세과목의 성적을 입력받아 총점 ,평균을 계산하여 출력
		// 사용자가 종료를 원할 때까지 반복
		
		Scanner sc = new Scanner(System.in);
		
		for(;;) {
			System.out.println("1과목의 성적의 입력해주세요: ");
			int n1 = sc.nextInt();
			System.out.println("2과목의 성적의 입력해주세요: ");
			int n2 = sc.nextInt();
			System.out.println("3과목의 성적의 입력해주세요: ");
			int n3 = sc.nextInt();
			int total = n1 + n2 + n3;
			double avg = (double) total / 3;
			System.out.printf("총점: %d, 평균:%f ",total, avg);
			System.out.print( "프로그램을 종료하시겠습니다?(y/n) : ");
			String strExit = sc.next();
			char isExit = strExit.charAt(0);
			if (isExit == 'y' || isExit == 'Y')
				break;
						
		}
		System.out.println("프로그램 종료");
	}

}
