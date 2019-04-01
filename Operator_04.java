package day_02;

public class Operator_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 증가/ 감소 연산자
		// ++, --
		// 특정 변수의 값을 1 증가하거나, 감소시킬 수 있는 연산자
		// 대입연산자를 사용하지 않고 값을 수정할 수 있음
		int num = 10;
		System.out.printf("num = %d\n", num);
		
		// 1을 증가하는 코드
		// 변수명 = 변수명 + 1
		num = num + 1;
		System.out.printf("num = %d\n", num);
		
		// 대입연산자를 사용하지않음
		num++; //num = num + 1;
		System.out.printf("num = %d\n", num);
		
		num--; //num = num - 1;
		System.out.printf("num = %d\n", num);
		
		
	}

}
