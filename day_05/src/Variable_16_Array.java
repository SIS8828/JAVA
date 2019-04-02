
public class Variable_16_Array {

	public static void main(String[] args) {
		// 2차원 배열과 반복문
		// 2차원 배열은 행과 열을 나타내는 2개의 인덱스를 사용하는 배열
		// 중첩된 형태의 반복문을 사용하여 2차원의 각 요소를 제어할 수 있음
		int [][] arr = new int[3][5];
		
		int value = 1;
		// 2차원 배열의 행을 제어하기 위한 외부의 반복문
		for( int i = 0 ; i < 3 ; i++ ) {
			
			// 2차원 배열의 각 행의 열을 제어하기 위한 내부의 반복문
			for( int j = 0 ; j < 5 ; j++ ) {
				
				arr[i][j] = value++;				
				System.out.printf("%d\t", arr[i][j]);
			}
			
			System.out.println();
		}

	}

}




