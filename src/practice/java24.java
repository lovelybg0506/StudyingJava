package practice;

import java.util.Scanner;

public class java24 {

	public static void main(String[] args) {
		// Ű����κ��� �Է¹��� ������ 1~n ��
		
		int sum = 0;
		int i;
		int num;

		System.out.print("���� �Է��ϼ��� : ");
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		
		for(i=1;i<=num;i++) {
			sum += i;
			
		}
		System.out.printf("1���� %d������ ���� : %d \n",num,sum);
		
		
	}

}
