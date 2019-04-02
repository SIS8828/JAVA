import java.util.Scanner;

public class Variable_17_Array {
	public static void main(String[] args) {
		// 3명의 학생 성적을 처리할 수 있는 프로그램을 작성하세요. 
		// 성적은 5과목이며, 사용자가 입력한 값으로 저장합니다.
		// 입력이 끝난 후에는 각 학생의 총점과 평균을 출력하세요.
		
		Scanner sc =  new Scanner(System.in);
		int [][] score = new int[3][5];
		
		// 학생의 인덱스를 제어하는 외부의 반복문
		for( int i = 0 ; i < 3 ; i++ ) {
			System.out.printf("%d 번째 학생 성적을 입력받습니다.\n", i+1);			
			// 각 학생의 성적 인덱스를 제어하는 반복문
			for( int j = 0 ; j < 5 ; j++ ) {
				System.out.printf("%d 번째 학생의 %d 번째 성적을 입력 : ",i+1, j+1);
				score[i][j] = sc.nextInt();
			}			
		}
		
		// 학생의 인덱스를 제어하는 외부의 반복문
		for( int i = 0 ; i < 3 ; i++ ) {
			System.out.printf("%d 번째 학생 성적 정보를 출력합니다.\n", i+1);
			int tot = 0;	// 각 학생의 총점
			double avg;		// 각 학생의 평균
			// 각 학생의 성적 인덱스를 제어하는 반복문
			for( int j = 0 ; j < 5 ; j++ ) {
				tot += score[i][j];
			}
			avg = (double)tot / 5;
			System.out.printf("%d 번째 학생의 ", i+1);
			System.out.printf("총점은 %d 점, 평균은 %.2f 점 입니다.\n", tot, avg);
		}
		
	}
}





