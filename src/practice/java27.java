package practice;

public class java27 {

	public static void main(String[] args) { // 주사위 랜덤 두개의 합 5. math.random과 while 사용
		
		while(true) {
			int a = (int)(Math.random()*6)+1;
			int b = (int)(Math.random()*6)+1;
			System.out.println("("+a+","+b+")");
			
			if(a+b==5) 
				break;
			
			
		}

	}

}
