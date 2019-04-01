import java.util.Scanner;

public class ControlStatement_FOR_04_Example {

	public static void main(String[] args) {
		// 사용자에게 3개의 정수를 입력받아
		// 입력된 정수의 합계, 평균, 최대값, 최소값을 출력하세요.
		// 값의 입력은 반복문으로 처리하세요.
		
		Scanner sc = new Scanner(System.in);
		
		int total = 0;
		double avg;
		int max = 0, min = 0;
		
		for(int i = 1 ; i <= 3 ; i++ ) {
			System.out.printf("%d 번째 점수를 입력하세요: ", i);
			int temp = sc.nextInt();
			
			total += temp;
			
			// 첫번째 입력 데이터로 최대값과 최소값을 설정
			if( i == 1) {
				max = min = temp;
			} else {
				if (temp > max )
					max = temp;
				if(min > temp)
					min = temp;
			}
		}
		
		avg = (double)total / 3;
		
		
		
		System.out.printf("total: %d\n", total);
		System.out.printf("avg: %.2f\n", avg);
		System.out.printf("max: %d\n", max);
		System.out.printf("min: %d\n", min);
	}

}
