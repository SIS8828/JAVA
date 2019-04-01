
import java.util.Scanner;
public class ControlStatement_FOR_10_Example_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 중첩된 반복문을 호라용하여 학생의 성적을 처리하는 프로그램을 작성하세요
		// 학생수를 입력하세요 : 3
		// 과목수를 입력하세요 : 3
		// 1번째 학생의 1번째 성적을 입력하세요 : 100
		// 1번째 학생의 2번째 성적을 입력하세요 : 100
		// 1번째 학생의 3번째 성적을 입력하세요 : 100
		// 1번째 학생의 총점은 100점, 평균은 100.00점 입니다.
		// 2번째 학생의 1번째 성적을 입력하세요 : 100
		// 2번째 학생의 2번째 성적을 입력하세요 : 100
		// 2번째 학생의 3번째 성적을 입력하세요 : 100
		// 2번째 학생의 총점은 100점, 평균은 100.00점 입니다.
		// 3번째 학생의 1번째 성적을 입력하세요 : 100
		// 3번째 학생의 2번째 성적을 입력하세요 : 100
		// 3번째 학생의 3번째 성적을 입력하세요 : 100
		// 3번째 학생의 총점은 100점, 평균은 100.00점 입니다.
		
		//1 입력
		int students, subjects;
		System.out.print("학생수를 입력하세요 : ");
		students = sc.nextInt();
		System.out.print("과목수를 입력하세요 : ");
		subjects = sc.nextInt();
		
		// 2. 처리
		
		for (int i = 1 ; i <= students ; i++ ) {
			// 2-1. 입력
			int total = 0;
			double avg;
			for(int j = 1 ; j <= subjects; j ++) {
				System.out.printf("%d번째 학생의 %d번째 성적을 입력하세요 :", i,j);
				total += sc.nextInt();
				
			}
			avg = (double) total / subjects;
			// 2-2 출력
			System.out.printf("%d번째 학생의 총점은 %d점, 평균은 %f점 입니다. \n",i,total,avg);
			
			
		}	
		/*
		int student;
		System.out.print("학생수를 입력하세요 : ");
		student = sc.nextInt();
		int object;
		System.out.print("과목수를 입력하세요 : ");
		object = sc.nextInt();
		int n1;
		int n2;
		int n3;
		for( int i = 1; i < student; i++) {
			for(int j =1 ; j < object; j++) {
				System.out.printf("%d번째 학생의 %d번째 성적을 입력하세요: \n",i,j);
				n1 = sc.nextInt();
			
			}
			 
		}
		*/
		System.out.println("프로그램종료.");
		
	}

}
