package day_02;

public class Variable_05 {

	public static void main(String[] args) {
		// 3과목의 성적이 있습니다. (97, 79, 85)
		// 세과목의 성적을 변수에 저장한후,
		// 총점과 평균을 계산하여 출력하세요.
		
		//int n1 = 97, n2 = 79, n3 = 85;
		
		
		//System.out.printf("총점은 %d이고, 평균은 %d",n1 + n2 + n3,(n1 + n2 + n3)/3 );

		// 1. 입력 : 키보드 입력, 파일 입력, 네트워크 입력, 데이터베이스 입력
		// - 저장을 위한 변수의 선언
		int n1 = 97;
		int n2 = 80;
		int n3 = 85;
		
		// 2. 처리 : 입력된 데이터를 사용하여 계산작업
		// - 처리결과를 저장하기 위한 변수 선언
		
		int total = n1 + n2 + n3;
		int avg = total / 3;
		
		// 3. 출력/저장/전송 : 모니터 출력, 파일 저장, 네트워크 출력, 프린트 출력
		// - 처리ㅘ정에서 생성된 변수를 사용해여 출력
		
		System.out.printf("총점 : %d, 평균 : %d\n", total, avg);
	}

}
