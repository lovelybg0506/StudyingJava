package practice;

import java.util.Scanner;

public class java35 {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		
		System.out.print("���丮�� ���� �Է�: ");
		int su= in.nextInt();
		int res=factorial(su);

		System.out.println(su+"�� ���丮�� ��: "+res);
	}

	private static int factorial(int su) {
		if(su==1)
		return 1;
		return su*factorial(su-1);
	}

}
