
public class Variable_03 {

	public static void main(String[] args) {
		// 변수의 선언 위치
		// 변수의 사용 전이라면 위치에 관계없이 변수를 선언할 수 있음
		
		int n1;
		System.out.println("프로그램 시작");
		int n2;
		
		//n3변수의 신언 전이기 때문에 n3접근 할 수 없음.
		//System.out.printf("n3 = %d\n", n3);
		int n3 = 30;
		System.out.printf("n3 = %d\n", n3);
		//변수에 값이 없으면 안됨.
		int n4;
		// 변수는 생성과 동시에 쓰레기 값을 대입받게 된다.
		// 쓰레기 값을 가지고 있는 변수는 사용할 수 없다.
		// 변수의 초기화 : 변수 선언 이후, 최초로 값을 대입하는 것
		//n4 변수가 초기화 되지 않아 사용불가능
		n4 = 40;
		// 변수의 초기화 이후에는 변수가용 가능
		System.out.printf("n4 = %d\n", n4);
	}

}
