
import java.util.Scanner;

public class ControlStatement_FOR_02_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 사용자에게 2개의 정수를 입력받아
		// 2개의 정수 중 작은 값부터 시작하여
		// 큰값 까지 홀수만 출력하세요
		// 1번째 정수 : 5
		// 2번째 정수 : 10
		// 결과 : 5, 7, 9

		// 1번째 정수 :17
		// 2번째 정수 : 7
		// 결과 : 7, 9, 11, 13, 15, 17

		Scanner sc = new Scanner(System.in);

		int n1, n2;
		System.out.print("첫번째의 정수를 입력해주세요: ");
		n1 = sc.nextInt();
		System.out.print("두번째의 정수를 입력해주세요: ");
		n2 = sc.nextInt();
		
		// 처리
		// 입력된 두개의 정수를 start(작은값), end(큰값)로 설정
		int start = n1 > n2 ? n2 : n1;
		int end = n1 > n2 ? n1 : n2;
		
		String output = "(";
		
		for( ; start <= end ; start ++ )
			if (start % 2 == 1)
				output += start +
				(start == end || start + 1 == end ? ")" : ",");
		
		System.out.printf("결과: %s\n", output);
		
		/*
		if (num1 > num2) {
		for ( num1 ; num1 <= num2 ; num1 + 2)
			System.out.printf("i = %d\n", i);
			if( i % 2 == 0)
				System.out.printf("i = %d\n", i);
	} else
		for (num2 ; num2 <= num1 ; num2 + 2)
		*/
	}
}
