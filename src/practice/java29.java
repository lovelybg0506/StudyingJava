package practice;

public class java29 {

	public static void main(String[] args) { // 4x+5y=60 �� ��� �ظ� ���ض� (x,y) ���·� ���.  ��) x,y��10������ �ڿ���
			
		int x,y;
		
		for(x=1;x<=10;x++) {
			for(y=1;y<=10;y++) {
				if((4*x)+(5*y)==60) {
					System.out.println("("+x+","+y+")");
				}
			}
		}

	}

}
