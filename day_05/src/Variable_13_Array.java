import java.util.Scanner;

public class Variable_13_Array {

	public static void main(String[] args) {
		// 다차원 배열
		// 일차원 배열과 달리 다수개의 인덱스를 사용하여
		// 각 요소에 접근할 수 있는 배열
		// 1차원배열 : 선의 형태
		// 1차원배열의 인덱스 : 선상에 있는 각 요소의 위치값
		// 2차원배열 : 면의 형태(행와 열의 개념)
		// 2차원배열의 인덱스 : 행의 위치값, 열의 위치값
		// 3차원배열 : 정육면체의 형태
		// (다수개의 이차원배열이 중첩되는 형태)
		// 3차원배열의 인덱스 : 이차원배열의 위치값, 행의 위치값, 열의 위치값
		
		// 다차원 배열을 사용하는 이유
		
		// 두명의 학생 성적을 입력받아 출력하는 프로그램을 작성하세요.
		Scanner sc =  new Scanner(System.in);
		// 두명의 성적 정보를 저장할 수 있는 2차원배열
		int [][] score = new int[2][3];
		
		/*
		int [] score_1 = new int[3];
		int [] score_2 = new int[3];
		
		// 프로그램에서 다수개의 일차원이 사용되는 경우
		// 하나의 반복문으로는 해결할 수 없습니다.
		// 각각의 배열을 제어하기 위한 반복문을 중복해서 작성
		// - 일차원 배열이 다수개 사용되는 경우 2차원배열을 사용하여
		//   하나의 변수명으로 해결
		// - 2차원 배열이 다수개 사용되는 경우 3차원배열을 사용하여
		//   하나의 변수명으로 해결
		for( int i = 0 ; i < score_1.length ; i++ ) {
			System.out.printf("1번째 학생의 %d번째 성적을 입력 : ", i+1);
			score_1[i] = sc.nextInt();
		}		
		for( int i = 0 ; i < score_1.length ; i++ ) {
			System.out.printf("2번째 학생의 %d번째 성적을 입력 : ", i+1);
			score_2[i] = sc.nextInt();
		}
		*/
		

	}

}



















