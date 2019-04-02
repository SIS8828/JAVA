import java.util.Scanner;
public class Variable_08_Array {
	public static void main(String[] args) {
		// 3 과목의 성적을 입력받아, 총점과 평균을 출력
		Scanner sc = new Scanner(System.in);
		
		int n1, n2, n3;
		
		System.out.printf("1 번째 성적을 입력하세요 : ");
		n1 = sc.nextInt();
		System.out.printf("2 번째 성적을 입력하세요 : ");
		n2 = sc.nextInt();
		System.out.printf("3 번째 성적을 입력하세요 : ");
		n3 = sc.nextInt();
		
		int tot = n1 + n2 + n3;
		double avg = (double)tot / 3;
		
		System.out.printf("입력된 성적 : %d, %d, %d\n", n1, n2, n3);
		System.out.printf("총점 : %d 점, 평균 %.2f 점\n", tot, avg);
		
		
	}
}
