
public class Variable_19_Array {

	public static void main(String[] args) {
		// 서로 다른 크기의 1차원 배열을 포함하는 2차원 배열
		// 자바에서 사용되는 다차원 배열은 서로 다른 크기의 하위 배열을
		// 포함할 수 있습니다.
		
		// 2차원 배열 변수 선언
		int [][] arr;
		
		// 1차원 배열을 관리하는 2차원 배열을 생성
		// (1차원 배열은 생성되지 않음)
		arr = new int[3][];
		
		// 2차원 배열의 각 요소들에게
		// 실제 정주를 저장하는 일차원 배열을 할당
		arr[0] = new int[3];
		arr[1] = new int[5];
		arr[2] = new int[2];
		
		int value = 100;
		for( int i = 0 ; i < arr.length ; i++ ) {
			for( int j = 0 ; j < arr[i].length ; j++ ) {
				arr[i][j] = value++;
				System.out.printf("arr[%d][%d] = %d\n", i, j, arr[i][j]);
			}
			System.out.println();
		}

	}

}










