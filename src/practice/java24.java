package practice;

import java.util.Scanner;

public class java24 {

	public static void main(String[] args) {
		// 키보드로부터 입력받은 값까지 1~n 합
		
		int sum = 0;
		int i;
		int num;

		System.out.print("값을 입력하세요 : ");
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		
		for(i=1;i<=num;i++) {
			sum += i;
			
		}
		System.out.printf("1부터 %d까지의 합은 : %d \n",num,sum);
		
		
	}

}
