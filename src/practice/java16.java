package practice;

public class java16 {

	public static void main(String[] args) {

		int a = 10;
		int b = 3;
		
		float c = 10.0F;
		float d = 3.0F;

		System.out.println(a/b); // 정수형이기때문에 소수점 이하 누락.
		System.out.println(c/d);
		System.out.println(a/d); // 자동 형변환, 형변환의 원칙 : 더 많은 수를 표현할수 있는쪽으로 형변환됨.
								// 정수, 실수가 있을때 실수로 자동형변환
								// a가 10이 아닌 10.0으로 변환 후 계산됨.
	}

}
