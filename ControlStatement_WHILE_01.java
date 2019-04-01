
public class ControlStatement_WHILE_01 {

	public static void main(String[] args) {
		// while 반복문
		// for문은 정해진 횟수의 반복을 제어하는 경우 효율적
		// 배열의 크기만큼, 게시글의 개수만큼, 컬렉션 클래스의 데이터의 크기만큼
		// while 반복문은 정해지지않은 횟수를 처리하는 경우 효율적
		// (특정 조건이 만족할 때까지 반복을 수행)
		// (파일의 끝을 만날때까지, 상대반이 end를 입력할 때까지 반복을 수행)
		
		// while 문의 사용방법
		//while(조건식) {
		// 실행문;
		// }
		
		// 1~10 까지 정수를 화면에 출력하는 반복문을 작성하세요.
		for(int i = 1 ; i <= 10 ; i++)
			System.out.printf("i = %d\n", i);
		
		
		// 특정 변수의 값의 변화를 이용하여 박복을 수행하는경우
		int i = 1;
		while ( i <= 10) {
			System.out.printf("i = %d\n", i);
			i++;
		}
		
		
	}

}
