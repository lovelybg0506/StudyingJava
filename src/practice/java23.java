package practice;

public class java23 {

	public static void main(String[] args) {
			// 500부터 1000까지의 짝수합,홀수합 구하기
		
		int num;
		int sum1,sum2;
		
		sum1=0;
		sum2=0;
		
		for(num=500;num<=1000;num++) {
			if(num % 2 == 0)
				sum2 += num;
			else
				sum1 += num;
		}
		System.out.printf("500부터 1000까지 짝수의 합 : %d \n",sum2);
		System.out.printf("500부터 1000까지 홀수의 합 : %d \n",sum1);
	}

}
