package practice;

import java.util.Scanner;

public class java31 {

	public static void main(String[] args) {  // 은행. boolean,while,Scanner,switch 이용 예금,출금,조회,종료기능
		
		boolean run=true;
		int money = 0;
		Scanner s = new Scanner(System.in);

		while(run) {
		System.out.println("-----------------------");
		System.out.println("1.예금|2.출금|3.조회|4.종료 ");
		System.out.println("-----------------------");
		System.out.print("선택> ");
		
		int menuNum ;
		menuNum=s.nextInt();
		
		switch(menuNum) {
		case 1:
			System.out.print("예금액> ");
			money+=s.nextInt();
			break;
		case 2:
			System.out.print("출금액> ");
			money-=s.nextInt();
			break;
		case 3:
			System.out.print("조회> ");
			System.out.println(money);
			break;
		case 4:
			run=false;
			break;
		}
		
		}
		
		s.close();
		System.out.println();
		System.out.println("프로그램 종료");
	}

}
