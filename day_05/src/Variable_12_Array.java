import java.util.Scanner;
public class Variable_12_Array {
	public static void main(String[] args) {
		// 사용자에게 배열의 크기를 입력받아 배열을 생성하고,
		// 각 요소에 값을 입력받아 입력된 정수의 순서대로 값을 출력하세요.
		// 1. 배열의 요소 값을 오름차순으로 정렬한 후, 출력하세요
		// 2. 배열의 요소 값을 내림차순으로 정렬한 후, 출력하세요
		Scanner sc =  new Scanner(System.in);
	
		System.out.print("배열의 크기를 입력하세요 : ");	
		// 키보드로 입력된 정수의 값을 사용하여 배열을 생성
		int [] numbers = new int[sc.nextInt()];		
		
		for( int i = 0 ; i < numbers.length ; i++ ) {
			System.out.printf("%d 번째 정수 값을 입력 : ", i+1);
			numbers[i] = sc.nextInt();
		}
		
		// 입력된 순서대로 베열에 저장된 정수의 값을 출력
		System.out.println("정렬 전의 데이터 출력");
		for( int i = 0 ; i < numbers.length ; i++ )
			System.out.printf("%d\t", numbers[i]);
		System.out.println();
		
		// 오름차순 정렬
		// 외부의 반복문은 현재 정렬하고자 하는 위치의 인덱스를 제어
		for( int i = 0 ; i < numbers.length - 1 ; i++ ) {
			// 내부의 반복문은 외부의 반복문의 인덱스 다음 위치부터 시작하여
			// 배열의 끝까지 반복을 수행하면서 값의 비교, 값의 교환을 수행
			for( int j = i + 1 ; j < numbers.length ; j++ ) {				
				if( numbers[i] > numbers[j] ) {
					// SWAP 로직 - 두 변수의 값을 교환
					// 임시변수 temp에 i 번째 위치의 값을 저장
					int temp = numbers[i];
					// i 번째 위치에 j 번째 위치의 값을 저장
					numbers[i] = numbers[j];
					// j 번째 위치에 temp 값을 저장
					numbers[j] = temp;
				}				
			}
		}		
		System.out.println("오름차순 정렬 후의 데이터 출력");
		for( int i = 0 ; i < numbers.length ; i++ )
			System.out.printf("%d\t", numbers[i]);
		System.out.println();
		
		// 내림차순 정렬
		// 외부의 반복문은 현재 정렬하고자 하는 위치의 인덱스를 제어
		for( int i = 0 ; i < numbers.length - 1 ; i++ ) {
			// 내부의 반복문은 외부의 반복문의 인덱스 다음 위치부터 시작하여
			// 배열의 끝까지 반복을 수행하면서 값의 비교, 값의 교환을 수행
			for( int j = i + 1 ; j < numbers.length ; j++ ) {
				
				if( numbers[i] < numbers[j] ) {
					// SWAP 로직 - 두 변수의 값을 교환
					// 임시변수 temp에 i 번째 위치의 값을 저장
					int temp = numbers[i];
					// i 번째 위치에 j 번째 위치의 값을 저장
					numbers[i] = numbers[j];
					// j 번째 위치에 temp 값을 저장
					numbers[j] = temp;
				}
				
			}
		}
		
		System.out.println("내림차순 정렬 후의 데이터 출력");
		for( int i = 0 ; i < numbers.length ; i++ )
			System.out.printf("%d\t", numbers[i]);
		System.out.println();
	}

}








