
public class ControlStatement_FOR_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//break 키워드
		// 반복문과 switch 구문 내부에서 사용할 수 있는 키워드
		// 현재 실행되고 있는 첫번째 영역을 빠져나가는 명령
		// break를 감싸고 있는 첫번째 영역{}이 if문인 경우 무시
		// if문을 제외한 첫번째 영역을 빠져가나는 명령
		
		for (int i = 1 ; i <= 10 ; i++) {
			if ( i ==5) {
				// break 키워드를 감싸고 있는 if 문을 제외한
				// 첫번째 영역( for문)을 빠져나가는 명령
				// - 반복을 중지하는 명령
				
				break;
			}
			
			
			System.out.printf("i = %d\n",i);
			
		}
	}

}
