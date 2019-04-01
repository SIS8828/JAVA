
public class ControlStatement_FOR_10_Example_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 구구단
		// 조건 :
		/*
		 * 2 x 2 = 4 2 x 4 = 8 2 x 6 = 12 2 x 8 = 16
		 * 
		 * 3 x 1 = 3
		 */

		for (int i = 2; i < 10; i++) {
			if (i % 2 == 1) {

				System.out.printf("<%d>단을 출력합니다.\n", i);
				for (int j = 1; j < 10; j += 2) {
					System.out.printf("%d X %d = %d\n", i, j, i * j);
				}
			}
			if (i % 2 == 0) {
				System.out.printf("<%d>단을 출력합니다.\n", i);
				for (int j = 2; j < 10; j += 2) {
					System.out.printf("%d X %d = %d\n", i, j, i * j);
				}
/* 다른방법
1.  for( int i = j % 2 == 0 ? 2: 1; j < 10 ; j+= 2)
	System.out.printf("%d X %d = %d\n", i, j, i * j);
	
2.  boolean flag_1 = i % 2 == 0 && j % 2 == 0;
	boolean flag_2 = i % 2 == 1 && j % 1 == 0;

	if(flag_1 || flag_2 )
	System.out.printf("%d X %d = %d\n", i, j, i * j);
	
3.  if( i % 2 == j % 2)
	System.out.printf("%d X %d = %d\n", i, j, i * j);
 */
				
				
			}

			System.out.println();
		}

	}

}
