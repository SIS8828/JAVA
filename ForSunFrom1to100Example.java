
public class ForSunFrom1to100Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;

		int i = 0;
		
		for(i = 1; i <= 100; i++) {
			sum += i;
			
		}
		System.out.printf("1~%dÀÇ ÇÕ: %d",i-1,sum);
	}

}
