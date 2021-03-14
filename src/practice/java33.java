package practice;

import java.util.Scanner;

public class java33 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int arr[]=new int[3];
		int sum=0;
		
		for(int i=0;i<arr.length;i++) {
			System.out.print((i+1)+"번째 수를 입력하세요 : ");
			arr[i]=s.nextInt();
			sum+=arr[i];
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print("["+i+"]번째수는 : "+arr[i]);
			System.out.println();
		}
		System.out.println("합계==> "+sum);
	}

}
