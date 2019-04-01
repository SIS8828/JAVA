package day_02;

import java.util.Scanner;

public class ControlStatement_IF_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 로그인 프로그램
		// ID와 패스워드는 모두 정수
		// 입력된 ID 와 패스워드의 합이 3 또는 5의 배수인경우 로그인 성공
		// 아니라면 로그인실패
		
		Scanner sc = new Scanner(System.in);
		
		
		// 입력
		int id;
		int password;
		// int total ;
		System.out.print("ID를 입력해주세요.: ");
		id = sc.nextInt();
		System.out.print("비밀번호를 입력해주세요.: ");		
		password = sc.nextInt();
		
		// 처리
		boolean result;
		/* total = id + password;
		
		if (total % 3 == 0 || total % 5 == 0)
			result = true;
		else
			result = false;
		*/
		
		// boolean 변수를 활용한 if 문 작성
		boolean flag_1 = (id + password) % 3 == 0 ;
		boolean flag_2 = (id + password) % 5 == 0 ;
		boolean flag = flag_1 || flag_2;
		
		if( flag)
			result = true;
		else
			result = false;
		
		if(result)
			System.out.println("로그인성공");
		else
			System.out.println("로그인실패");
		
		
	}

}
