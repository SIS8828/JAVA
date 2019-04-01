
import java.util.Scanner;

public class ControlStatement_SWITCH_04 {

	public static void main(String[] args) {
		// 사용자에게 1~ 12 사이의 정수를 입력받으세요
		// 입력된 정수에 해당되는 월의 날짜수를 출력하세요.
		// EX) 1~12
		// 		5월은  '31'일 까지 있습니다.
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		System.out.println("1~12 사이의 정수를 입력하세요.");
		num = sc.nextInt();
		
		int day;
		
		switch(num) {
		case 12:
			day = 31; break;
		case 11:
			day = 30; break;
		case 10:
			day = 31; break;
		case 9:
			day = 30; break;
		case 8:
			day = 31; break;
		case 7:
			day = 31; break;
		case 6:
			day = 30; break;
		case 5:
			day = 31; break;
		case 4:
			day = 30; break;
		case 3:
			day = 31; break;
		case 2:
			day = 28; break;
		case 1:
			day = 31; break;
		
		default :
			day = -1 ;
		}
		if( day != -1)
			System.out.printf("입력된 값 %d는 '%d'일 까지 있습니다.\n", num, day);
		else
			System.out.println("잘못된 입력 값입니다. \n");
	}

}
