package day_02;

public class Operator_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 증감/감소 연산자
		// 전위/후위 연산자
		// ++/-- 변수명 앞 또는 뒤에 위치
		// 변수명 앞일 경우 전위 변수명 뒤일경우 후위
		
		
		// 후위 증가/감소 연산자는 연산자의 실행 시점을 1번 늦춰서실행합니다. 
		//e ex) x = x+ 1 x는 1이지만 다음번 x는 1이 증가되있다.
	
		int num1 = 10;
		int num2 = num1++;
		
		System.out.printf("num1 = %d, num2 = %d\n",num1,num2);
		
		// 전위는 즉시 실행한다.
		
		int num4 = 100;
		int num5 = ++num4;
		
		System.out.printf("num4 = %d, num5 = %d\n",num4,num5);

		// 10 12 12 12 12
		
		int temp = 10;
		System.out.printf("%d %d %d %d %d\n",
				temp++, ++temp, temp--, ++temp, temp++);

	}

}
