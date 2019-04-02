
public class Variable_22_Array {
	public static void main(String[] args) {		
		// 2차원 배열의 복사
		// 2차원 배열에 대해서 clone 메소도를 실행하면
		// 얕은 복사가 실행됩니다.
		// (일차원 배열은 복사가 안됨) 
		// 2차원 배열의 깊은 복사를 구현하기 위해서는
		// 각각의 일차원 배열에 대해서 clone 메소드의 호출이 필요함
		int [][] arr1 = {{1,2,3}, {4,5,6}};
		
		System.out.println("arr1 : ");
		for( int i = 0 ; i < arr1.length ; i++ ) {
			for( int j = 0 ; j < arr1[i].length ; j++ )
				System.out.printf("%d   ", arr1[i][j]);
			System.out.println();
		}
		System.out.println();
		
		// arr1의 형태를 복사하는 clone 메소드 실행
		int [][] arr2 = arr1.clone(); 
		
		// arr1의 일차원 배열들을 복사하는 깊은복사 구현 코드
		for( int i = 0 ; i < arr1.length ; i++ )
			arr2[i] = arr1[i].clone();
		
		System.out.println("arr1 : ");
		for( int i = 0 ; i < arr1.length ; i++ ) {
			for( int j = 0 ; j < arr1[i].length ; j++ )
				System.out.printf("%d   ", arr1[i][j]);
			System.out.println();
		}
		System.out.println();
		
		System.out.println("arr2 : ");
		for( int i = 0 ; i < arr2.length ; i++ ) {
			for( int j = 0 ; j < arr2[i].length ; j++ )
				System.out.printf("%d   ", arr2[i][j]);
			System.out.println();
		}
		System.out.println();
		
		arr2[1][0] = 400;
		
		System.out.println("arr1 : ");
		for( int i = 0 ; i < arr1.length ; i++ ) {
			for( int j = 0 ; j < arr1[i].length ; j++ )
				System.out.printf("%d   ", arr1[i][j]);
			System.out.println();
		}
		System.out.println();
		
		System.out.println("arr2 : ");
		for( int i = 0 ; i < arr2.length ; i++ ) {
			for( int j = 0 ; j < arr2[i].length ; j++ )
				System.out.printf("%d   ", arr2[i][j]);
			System.out.println();
		}
		System.out.println();
		
	}
}














