package practice;


import java.util.Scanner;

public class java5{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (var sc = new Scanner(System.in)) {
			int i = sc.nextInt(); // 숫자입력값.
			while(i < 10) {        // i가 10보다 작은동안 계속 실행
				
				System.out.print(i);
				System.out.print("x");
				System.out.print(i);
				System.out.print("=");
				System.out.println(i*i);
				i++;
			}
		}
	}

}

