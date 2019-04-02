import java.util.Scanner;
public class Variable_11_Array {

	public static void main(String[] args) {
		// 사용자에게 배열의 크기를 입력받아 배열을 생성하고,
		// 각 요소에 값을 입력받아 총점/평균을 출력하세요.
		// 최대값, 최소값을  출력하세요.
		Scanner sc =  new Scanner(System.in);
		
		// 배열의 크기를 입력받아, 해당 크기의 배열을 생성
		int size;
		System.out.print("배열의 크기를 입력하세요 : ");
		size = sc.nextInt();
		
		int [] numbers = new int[size];
		
		// 생성된 배열의 크기만큼 반복을 실행하면서
		// 값을 입력받는 코드
		for( int i = 0 ; i < numbers.length ; i++ ) {
			System.out.printf("%d 번째 정수 값을 입력 : ", i+1);
			numbers[i] = sc.nextInt();
		}
		
		int tot, max, min;
		double avg;
		// 총점, 최대값, 최소값은 배열의 첫번째 요소의 값을 설정
		tot = max = min = numbers[0];
		// 배열의 첫번째 요소의 값은 위의 코드에서 
		// 총점, 최대값, 최소값에 대입된 상태이므로
		// 인덱스는 1 부터 시작
		for( int i = 1 ; i < numbers.length ; i++ ) {
			tot += numbers[i];
			
			if( numbers[i] > max )
				max = numbers[i];
			
			if( min > numbers[i] )
				min = numbers[i];
		}
		avg = (double)tot / numbers.length;
		
		System.out.printf("합계 : %d, 평균 : %.2f\n", tot, avg);
		System.out.printf("최대값 : %d, 최소값 : %d\n", max, min);
	}

}








