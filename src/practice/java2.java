package practice;

public class java2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		char var1 = '규'; // 한글자의 한글 또는 영문 사용 가능 (싱글따옴표)
		String var2 = "규의 자바 변수와 데이터 형식"; // 여러글자의 문자열 가능
		// 문자형
		
		
		byte var3 = 7; // -128 ~ +127 숫자 사용 가능
		short var4 = -32768; // -32768 ~ +32767 숫자 사용 가능
		int var5 = 999999999;// -21억 ~ +21억 숫자 사용 가능\
		long var6 = 999999999; // 여러숫자의 입력 가능
		//정수형
		
		
		
		float var7 = 0.5f; // 4byte 소수점선언 후 뒤에 f 입력해야함.
		double var8 = 0.005; // 8byte 소수점 선언
		//실수형
		
		
		boolean isStart = true; // only true or false 입력 가능 보통 조건식에서 많이 사용.
		//불린형?
		System.out.println(var1);
		System.out.println(var2);
		
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
		System.out.println(var6);
		
		System.out.println(var7);
		System.out.println(var8);
		
		System.out.println(isStart);
	}

}
