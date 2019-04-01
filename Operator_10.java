package day_02;

public class Operator_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 정수를 저장할 수 있는 gender 변수를 선언하고,
		// gender 변수에 주민등록번호 7번째 자리의 값으로 초기화하세요.
		// gender 변수의 값을 비교하여, 성별을 출력하세요

		int gender = 1;
		
		
		String sex;
		//sex = gender % 2 == 0 ? "여성" : "남성";
		sex = gender == 1 || gender == 3 ? "남성":"여성";
		System.out.printf("%d은 %s 입니다.\n",gender,sex);
	}

}
