
public class ControlStatement_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// <구구단 예제>
		// 2 * 1 = 2 3 * 1 = 3 4 * 1 = 4
		// 2 * 2 = 4 3 * 2 = 6 4 * 2 = 8
		// ...
		// 2 * 9 = 18 ...

		// 6 * 1 = 6 7 * 1 = 7 8 * 1 = 8
		// 6 * 2 = 4 7 * 2 = 6 8 * 2 = 16
		// ...
		
		int start_dan = 2;
		int depth = 3;
		int loop_count = 0;
		
		
		for (int i = 1; i < 10; i++) {
			// 구구단의 단수를 제어하기 위한 내부의반복문
			for (int j = start_dan + (loop_count*depth);
				j < start_dan + (loop_count + 1) * depth && j <= 9 ; j++) {
				// \t 는 tap
				System.out.printf(" %d * %d = %d \t", j, i, j*i);
			}
			
			System.out.println();
			
			if( i == 9 && start_dan + (loop_count + 1) * depth <= 9 ) {
				System.out.println();
				i = 0;
				loop_count++;
						
			}

		}
	}
}
