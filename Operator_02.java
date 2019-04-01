package day_02;

public class Operator_02 {

	public static void main(String[] args) {
		// 관계연산자
		// <,>,>=,<=,==,!=
		
		int n1 = 10;
		int n2 = 5;
		boolean result;
		
		//%b : boolean 타입의 값을 출력
		result = n1 > n2;
		System.out.printf("%d %c %d = %b\n",n1,'>',n2, result);
		result = n1 < n2;
		System.out.printf("%d %c %d = %b\n",n1,'<',n2, result);

		result = n1 >= n2;
		System.out.printf("%d %s %d = %b\n",n1,">=",n2, result);
		result = n1 <= n2;
		System.out.printf("%d %s %d = %b\n",n1,"<=",n2, result);
		result = n1 == n2;
		System.out.printf("%d %s %d = %b\n",n1,"==",n2, result);
		result = n1 != n2;
		System.out.printf("%d %s %d = %b\n",n1,"!=",n2, result);

	}

}
