
import java.util.Scanner;

public class ControlStatement_SWITCH_03 {

	public static void main(String[] args) {
		// 사용자에게 성적 점수 3개를 입력받아
		// 총점과 평균을 화면에 출력
		// 평균 점수를 기준으로 등급을 출력하세요.
		// 등급은 스위치문을 사용하여 처리하세요.
		
		Scanner sc = new Scanner(System.in);
		// 1. 입력
		int num1, num2, num3 ;
		System.out.print("국어 성적: ");
		num1 = sc.nextInt();
		System.out.print("수학 성적: ");
		num2 = sc.nextInt();
		System.out.print("영어 성적: ");
		num3 = sc.nextInt();
		
		// 2. 처리
		int total;
		double avg;
		char grade;
		total= num1 + num2 + num3;
		avg = (double) total / 3 ;
		
		String num;
		
		// avg = 99
		// avg / 10
		switch( avg < 0 || avg > 100 ? -1 : (int) avg/10 ) {
		case 10:
		case 9 :
			grade = 'A' ; break;
		case 8:
			grade = 'B' ; break;
		case 7:
			grade = 'C' ; break;
		case 6:
			grade = 'D' ; break;
		case 5:
		case 4:
		case 3:
		case 2:
		case 1:
		case 0:
			grade = 'F' ; break;
		default:
			grade = '?';
		
		}
		// 출력
		System.out.printf("총점은 %d, 평균: %f\n",total, avg);
		if(grade != '?')
			System.out.printf("성적은 '%c' 입니다.\n", grade);
		else
			System.out.println("성적 점수를 확인하세요.");
	}

}
