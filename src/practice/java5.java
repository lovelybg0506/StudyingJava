package practice;


import java.util.Scanner;

public class java5{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (var sc = new Scanner(System.in)) {
			int i = sc.nextInt(); // �����Է°�.
			while(i < 10) {        // i�� 10���� �������� ��� ����
				
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

