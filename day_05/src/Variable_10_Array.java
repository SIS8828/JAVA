import java.util.Scanner;
public class Variable_10_Array {
	public static void main(String[] args) {
		// 배열의 크기는 프로그램에서 중요한 정보입니다.
		// 배열의 크기에 따라 반복의 횟수나, 특정 인덱스의 값을 
		// 참조하는것이
		// 수시로 바뀌기 때문입니다.
		// 배열은 이러한 문제를 해결하기 위해 length 라는 속성을
		// 제공합니다.
		// 배열의이름.length -> 배열의 크기가 정수 타입으로 리턴
		
		// 5 과목의 성적을 입력받아, 총점과 평균을 출력
		Scanner sc = new Scanner(System.in);

		int [] score = new int[3];
		int tot = 0;
		
		// score 배열은 크기가 5이므로, 
		// score.length -> 5로 처리되어 실행됩니다.
		for( int i = 0 ; i < score.length ; i++ ) {
			System.out.printf("%d 번째 성적을 입력하세요 : ", i + 1);
			score[i] = sc.nextInt();
			tot += score[i];
		}	
		
		double avg = (double)tot / score.length;

		System.out.printf("총점 : %d 점, 평균 %.2f 점\n", tot, avg);
		
		
	}
}
