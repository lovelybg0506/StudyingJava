package practice;

import java.util.Scanner;

public class java31 {

	public static void main(String[] args) {  // ����. boolean,while,Scanner,switch �̿� ����,���,��ȸ,������
		
		boolean run=true;
		int money = 0;
		Scanner s = new Scanner(System.in);

		while(run) {
		System.out.println("-----------------------");
		System.out.println("1.����|2.���|3.��ȸ|4.���� ");
		System.out.println("-----------------------");
		System.out.print("����> ");
		
		int menuNum ;
		menuNum=s.nextInt();
		
		switch(menuNum) {
		case 1:
			System.out.print("���ݾ�> ");
			money+=s.nextInt();
			break;
		case 2:
			System.out.print("��ݾ�> ");
			money-=s.nextInt();
			break;
		case 3:
			System.out.print("��ȸ> ");
			System.out.println(money);
			break;
		case 4:
			run=false;
			break;
		}
		
		}
		
		s.close();
		System.out.println();
		System.out.println("���α׷� ����");
	}

}
