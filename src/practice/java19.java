package practice;

import java.util.Scanner;

public class java19 {

	public static void main(String[] args) {

		// Scanner�� switch �� �ֹι�ȣ�� �Է� �޾Ƽ� �������� �������� �����ϱ�

		char gender = ' ';
		String num= " ";
		
		Scanner s=new Scanner(System.in);
		System.out.println("�ֹε�Ϲ�ȣ�� �Է��ϼ��� (ex 123456 1234567) ��������");
		
		num = s.nextLine();
		gender = num.charAt(7);
		
		switch(gender) {
		case '1':
		case '3':
			System.out.println("�����Դϴ�.");
			break;
		case '2':
		case '4':
			System.out.println("�����Դϴ�.");
			break;
			default:
				System.out.println("��ȿ���� ���� �ֹε�Ϲ�ȣ�Դϴ�.");
		}
		s.close();
	}

}
