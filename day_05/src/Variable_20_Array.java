
public class Variable_20_Array {
	public static void main(String[] args) {
		// 배열의 복사
		// 1. 얕은 복사 
		// - 배열의 형태만 복사
		// - 실제 데이터의 복사가 일어나지 않음
		// 2. 깊은 복사
		// - 배열의 형태 및 실제 데이터의 복사
		
		// 1차원 배열의 복사
		// 1차원 배열은 깊은 복사를 구현합니다.
		int [] arr1 = {1,2,3,4,5};
		System.out.print("arr1 : ");
		for( int i = 0 ; i < arr1.length ; i++ )
			System.out.printf("%d   ", arr1[i]);
		System.out.println();
		
		// clone 메소드를 사용한 배열의 복사
		// 배열명.clone()
		// 해당 배열변수가 레퍼런스(참조)하고 있는 장소의 배열을
		// 새로운 공간에 복제합니다.
		
		// arr2는 arr1 배열이 복제된 배열을 참조하는 변수
		int [] arr2 = arr1.clone();
		
		System.out.print("arr1 : ");
		for( int i = 0 ; i < arr1.length ; i++ )
			System.out.printf("%d   ", arr1[i]);
		System.out.println();
		
		System.out.print("arr2 : ");
		for( int i = 0 ; i < arr2.length ; i++ )
			System.out.printf("%d   ", arr2[i]);
		System.out.println();
		
		// 복제된 배열의 요소 값을 변경한 이 후,
		// 원본 데이터와 함께 출력
		// 1차원 배열의 경우 깊은복사가 구현되기 때문에
		// arr2의 요소 값을 수정하여도, arr1의 데이터에는
		// 영향이 없음(완전 분리된 상태)
		arr2[1] = 222;
		
		System.out.print("arr1 : ");
		for( int i = 0 ; i < arr1.length ; i++ )
			System.out.printf("%d   ", arr1[i]);
		System.out.println();
		
		System.out.print("arr2 : ");
		for( int i = 0 ; i < arr2.length ; i++ )
			System.out.printf("%d   ", arr2[i]);
		System.out.println();
		
		arr1[1] = 0;
		
		System.out.print("arr1 : ");
		for( int i = 0 ; i < arr1.length ; i++ )
			System.out.printf("%d   ", arr1[i]);
		System.out.println();
		
		System.out.print("arr2 : ");
		for( int i = 0 ; i < arr2.length ; i++ )
			System.out.printf("%d   ", arr2[i]);
		System.out.println();

	}
}














