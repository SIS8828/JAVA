
public class Variable_21_Array {
	public static void main(String[] args) {		
		// 2차원 배열의 복사
		int [][] arr1 = {{1,2,3}, {4,5,6}};
		
		System.out.println("arr1 : ");
		for( int i = 0 ; i < arr1.length ; i++ ) {
			for( int j = 0 ; j < arr1[i].length ; j++ )
				System.out.printf("%d   ", arr1[i][j]);
			System.out.println();
		}
		System.out.println();
		
		// 이차원배열(다차원배열)은 clone 메소드의 결과로
		// 실제 일차원 배열을 관리하고 있는 2차원 배열만을 복사합니다.
		// (2차원 배열의 내부에 있는 1차원 배열은 복사하지 않음)
		// (형태만 복사)
		int [][] arr2 = arr1.clone(); 
		
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
		
		// arr1 과 공유하고 있는 1차원 배열의 값이 수정
		// 얕은 복사로 복사된 arr2의 값을 수정하게 되면
		// arr1로 변경된 값을 참조하게 됨
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














