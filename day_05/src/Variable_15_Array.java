
public class Variable_15_Array {
	public static void main(String[] args) {
		// 2차원 배열의 선언 및 초기화 방법
		// 1. 2차원 배열의 변수를 선언한 후, 배열을 할당
		int [][] arr1;
		arr1 = new int[2][3];
		
		// 2. 2차원 배열의 변수 선언과 동시에 배열을 할당
		int [][] arr2 = new int[2][3];
		
		// 1차원 배열과 마찬가지로 2차원도 HEAP 메모리에 
		// 생성되므로 초기화 값은 0 입니다.
		System.out.println(arr1[0][0]);
		System.out.println(arr2[0][0]);
		
		// 3. 2차원의 배열의 배열을 생성하면서 초기화하는 방법
		// 초기화 값을 설정하는 방법
		// { {1번째 행의 초기화 값}, {2번째 행의 초기화 값} ... }
		// 2행 3열의 2차원 배열을 생성하면서
		// 1번째 행의 요소 값을 1,2,3 으로
		// 2번째 행의 요소 값을 4,5,6 으로 지정
		int [][] arr3 = new int[][] {{1,2,3},{4,5,6}};
		System.out.println(arr3[0][2]);
		System.out.println(arr3[1][1]);
		
		int [][] arr4 = {{1,2,3},{4,5,6}};
		System.out.println(arr4[0][2]);
		System.out.println(arr4[1][1]);
	}
}















