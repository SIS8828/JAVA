package day_02;

// 키보드 입력을 위한 import 선언
import java.util.Scanner;


public class ControlStatement_IF_06 {

	public static void main(String[] args) {
		// 사용자로부터 3개의성적 점수를 입력받아
		// 총점과 평균을 출력하세요
		Scanner sc = new Scanner(System.in);


		int num1;
		int num2;
		int num3;
		
		System.out.println("3개의 성적을 입력해주세요 : ");
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		int total = num1 + num2 + num3 ;
		double avg = total / 3.0 ;
		

		System.out.printf("총점은 %d이고, 평균은 %f입니다.\n",total,avg);
		int num;
		
		System.out.print("성적을 입력해주세요: ");
		
		num = sc.nextInt();
		
		if( num >= 90)
			System.out.println("당신의 성적은 A 입니다.");
		else if( num >= 80)
			System.out.println("당신의 성적은 B 입니다.");
		else if( num >= 70)
			System.out.println("당신의 성적은 C 입니다.");
		else if( num >= 60)
			System.out.println("당신의 성적은 D 입니다.");
		else if( num < 0 || num > 100 )
			System.out.println("유효하지 않은 값 입니다.");
		else
			System.out.println("당신의 성적은 F 입니다.");
	}

}
