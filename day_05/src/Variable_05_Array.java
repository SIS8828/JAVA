
public class Variable_05_Array {

	public static void main(String[] args) {
		// 배열의 선언과 생성 방법
		// 1. 배열 변수의 선언 후, 실제 배열 공간을 할당 받는 방법 
		int [] arr1 = null;
		arr1 = new int[5];
		
		// 2. 배열 변수의 선언과 배열의 생성을 동시에 진행
		int [] arr2 = new int[5];
		
		// HEAP 메모리의 특징
		// 배열은 HEAP 메모리에 new 연산자를 통해서 생성되며
		// HEAP 메모리에 생성되는 모든 영역은 0 또는 0.0, null
		// 값으로 초기화됩니다.
		System.out.println(arr1[0]);
		System.out.println(arr2[0]);
		
		// 3. 배열을 생성하면서 임의의 값으로 초기화하는 방법
		// 크기가 5 인 배열을 생성하면서,
		// 각 요소의 값을 1,2,3,4,5 로 초기화하는 코드
		int [] arr3 = new int[] {1,2,3,4,5};
		System.out.println(arr3[0]);	// 배열의 첫번째요소 값 확인
		System.out.println(arr3[4]);	// 배열의 마지막요소 값 확인
		
		int [] arr4 = {1,2,3,4,5};
		System.out.println(arr4[1]);	// 배열의 2번째요소 값 확인
		System.out.println(arr4[3]);	// 배열의 4번째요소 값 확인
	}

}











