package practice;

public class java22 {

	public static void main(String[] args) {

		int a;
		int sum2 = 0;
		int sum1 = 0;
		
		for (a = 500; a <= 1000; a += 2) {
			sum2 += a;
		}
		System.out.printf("500에서 1000까지의 짝수의 합:%d\n", sum2);
		
	
		for (a = 501; a <= 1000; a += 2) {
			sum1 += a;
		}
		System.out.printf("500에서 1000까지의 홀수의 합:%d\n", sum1);

	}

}

	