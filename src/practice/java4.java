package practice;

public class java4 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub   //for (반복문) ,  반복횟수를 알때, 
											//while문은 반복횟수를 모를때.  
											//do while문은 블럭{}을 최소한 한번 이상 반복할때 = 사용자 입력을 받을때 유용
		
		String str[] = {"1","2","3","4","","","",""};   // 아무것도 안쓰여있어도 되네
		
		
		for(int i=0; i<10; i++) {  		// int i는 0부터 ,i가 3보다 작을때까지 계속 실행 i++는 1증가시켜주는것
		System.out.println("Gyujava");
		}
		
		System.out.println("반복문 for");
		
		for(int i=0; i<str.length; i++) { // str.length = str 수? 그냥 for(int)의 응용버전.
			System.out.println("Ok.");
		}
	}

}
