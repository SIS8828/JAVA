package day_02;

import java.util.Scanner;

public class ControlStatement_IF_05 {
	public static void main(String[] args) {
		//조건식이 다수개인 경우 처리할 수 있는 if 문의 구성
		// if (1번째 조건식)
		// 		1번재 조건식이 참일경우 실행할 문장
		// else if(2번째 조건식)
		// 		2번째 조건식이 참일경우 실행할 문장
		// ....
		// else
		//  	모든문장이 거짓일 경우 실행할 문장

	Scanner sc = new Scanner(System.in);
	
	int menu;
	
	System.out.println("1. 한식");
	System.out.println("2. 일식");
	System.out.println("3. 양식");
	System.out.println("메뉴 번호를 선택하세요 : ");
	
	//사용자가 입력된 정수의 값을 대입
	
	menu = sc.nextInt();

	if( menu == 1)
		System.out.println("오늘의 한식은 비빔밥");
	else if( menu == 2)
		System.out.println("오늘의 일식은 초밥");
	else if( menu == 3)
		System.out.println("오늘의 양식은 스테이크");
	else
		System.out.println("제공되지 않은 번호");
	
	// 입력된 메뉴 번호를 각각의 if문을 사용하여 처리하는 경우
	
	/*
	if( menu == 1)
		System.out.println("오늘의 한식은 비빔밥");
	if( menu == 2)
		System.out.println("오늘의 일식은 초밥");
	if( menu == 3)
		System.out.println("오늘의 양식은 스테이크");
	*/
	
	
	}
}
