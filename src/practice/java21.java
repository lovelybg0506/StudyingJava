package practice;

public class java21 {

	public static void main(String[] args) {

		int i;
		int sum =0; // 누적 시키려면 무조건 초기화 시켜야함.
		
		for(i=1;i<=10;i++) {
			sum+=i;
		}	// 여기서 중괄호로 닫으면 마지막 값만 %d에 출력됨.
			System.out.printf("%d\n",sum);
//		}	// 여기서 중괄호로 닫으면 1부터 55까지 값들이 전부 출력됨.

	}

}
