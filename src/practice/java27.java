package practice;

public class java27 {

	public static void main(String[] args) { // �ֻ��� ���� �ΰ��� �� 5. math.random�� while ���
		
		while(true) {
			int a = (int)(Math.random()*6)+1;
			int b = (int)(Math.random()*6)+1;
			System.out.println("("+a+","+b+")");
			
			if(a+b==5) 
				break;
			
			
		}

	}

}
