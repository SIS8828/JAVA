package day_02;

public class ControlStatement_FOR_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// continue 키퉈드
		// if 문을 제외한 첫번째 블럭의 종료지점으로 이동하는 명령
		// 다음 반복으로 건너 뛰는 명령으로 반복문 내부에서만 사용할 수 있습니다. 
		
		for( int i = 1; i <= 10 ; i ++) {
			if( i == 6)
				continue;
			
			System.out.printf("i = %d\n", i);
		}
	}

}
