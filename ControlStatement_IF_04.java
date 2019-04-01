package day_02;

// 키보드입력을 처리하기 위해서 선언한 import 문
import java.util.Scanner;

public class ControlStatement_IF_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 키보드 입력을 위해서 선언한 변수
		Scanner sc = new Scanner(System.in);
		
		int number;
		System.out.print("정수를 입력하세요: ");
		
		// 키보드에서 입력된 정수의 값을 int 타입으로 제공하는 메소드
		// int 타입을 제공하는 메소드
		// nextInt : 키보드에서 입력된 정수 값을 리턴
		// nextDouble:실수값
		// next: 문자열
		number = sc.nextInt();
		
		if (number % 2 == 0)
			System.out.printf("입력된값은 짝수입니다\n")
		else
			System.out.printf("입력된값은 홀수 입니다.\n",);
	}
	

}
