package practice;

public class java8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int intArray [] = new int[5]; // intArray라는 변수에다가 5의 공간만큼을 배열로 선언. (0,1,2,3,4,5)
		
		try
		{
			intArray[3] = 10;
			intArray[6] = 1;
			
		}
		catch (Exception e)  		// Exception = 예외
		{
			e.printStackTrace();		 // 실제 에러문을 출력.
			System.out.println("배열 범위 초과");
			System.exit(0); // 강제로 프로그램 종료.
		}
	
		System.out.println("프로그램이 끝났습니다."); 	// System.exit(0); 때문에 출력되지 않음.
		
		
	
	}
		
}

