import java.util.Scanner;
public class Variable_09_Array {
	public static void main(String[] args) {
		// 5 과목의 성적을 입력받아, 총점과 평균을 출력
		Scanner sc = new Scanner(System.in);
		// 성적 점수를 입력받아 저장하기 위한
		// 배열 변수의 선언
		int [] score = new int[5];
		
		// 총점을 저장하기 위한 변수
		// 반복문 내부에서 누적되기 때문에
		// 0 으로 초기화를 진행함
		int tot = 0;
		
		// 반복문을 활용하여 성적을 입력받는 코드
		// 인덱스의 값이 변경되면서 다른 위치의 요소에
		// 키보드로 입력된 데이터가 대입됩니다.
		for( int i = 0 ; i < 5 ; i++ ) {
			System.out.printf("%d 번째 성적을 입력하세요 : ", i + 1);
			score[i] = sc.nextInt();	
			// 입력된 데이터를 배열에 저장한 후,
			// 총점 변수에 누적하는 코드
			tot += score[i];
		}	
		
		double avg = (double)tot / 5;

		System.out.printf("총점 : %d 점, 평균 %.2f 점\n", tot, avg);
		
		
	}
}
