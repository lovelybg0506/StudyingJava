package practice;

import java.util.Scanner;

public class java19 {

	public static void main(String[] args) {

		// Scanner와 switch 로 주민번호를 입력 받아서 남자인지 여자인지 구별하기

		char gender = ' ';
		String num= " ";
		
		Scanner s=new Scanner(System.in);
		System.out.println("주민등록번호를 입력하세요 (ex 123456 1234567) 공백포함");
		
		num = s.nextLine();
		gender = num.charAt(7);
		
		switch(gender) {
		case '1':
		case '3':
			System.out.println("남자입니다.");
			break;
		case '2':
		case '4':
			System.out.println("여자입니다.");
			break;
			default:
				System.out.println("유효하지 않은 주민등록번호입니다.");
		}
		s.close();
	}

}
