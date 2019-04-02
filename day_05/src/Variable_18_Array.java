
public class Variable_18_Array {

	public static void main(String[] args) {
		// 다차원 배열의 length 정보를 추출하는 방법
		// 2차원 배열은 인덱스가 2개 사용되는 배열
		// 2차원 배열로 부터 반환받을 수 있는 length 속성으
		// 2개가 됩니다.
		// (3차원 배열은 3개)		
		int [][] arr = new int[2][3];
		
		// 이차원 배열명에 length 속성은 1차원 배열의 개수가 반환됩니다.
		System.out.printf("arr.length -> %d\n", arr.length);
		// 이차원 배열의 각 요소에 대해서 인덱스 연산으로 접근한 후,
		// length 속성을 사용하면 각 일차원 배열의 크기가 반환됩니다.
		System.out.printf("arr[0].length -> %d\n", arr[0].length);
		System.out.printf("arr[1].length -> %d\n", arr[1].length);

		// 이차원 배열을 순회할 수 있는 반복문(length 사용)
		// 행의 인덱스를 제어하는 외부의 반복문
		for( int i = 0 ; i < arr.length ; i++ ) {
			// 열의 인덱스를 제어하는 내부의 반복문
			for( int j = 0 ; j < arr[i].length ; j++ ) {
				arr[i][j] = i * j + 1;
				System.out.printf("arr[%d][%d] = %d\n", i, j, arr[i][j]);
			}
		}
	}

}

















