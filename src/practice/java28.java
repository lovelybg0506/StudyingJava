package practice;

public class java28 {

	public static void main(String[] args) { // 1~100 사이의 3배수 합 for문 사용.
		
		int i;
		int sum=0;
		
		for(i=1;i<=100;i++) {
			if(i%3==0) {
				sum+=i;
			}
		}
		System.out.println(sum);
	}

}
