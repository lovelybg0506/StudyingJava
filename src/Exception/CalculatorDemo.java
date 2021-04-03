package Exception;

class Calculator{
	int left, right;
	
	public void setOprands(int left, int right) {
//		if(right==0) {
//			throw new IllegalArgumentException("두번째 인자는 0을 허용하지 않습니다.");
//		}
		this.left=left;
		this.right=right;
	}
	
	public void divide() {
		if(right==0) {
			throw new ArithmeticException("0으로 나눌 수 없습니다.");	// 이부분에 발생한 순간 예외 발생 후 설명
		}
		try {
			System.out.println("계산결과는 ");
			System.out.println(this.left/this.right);
			System.out.println(" 입니다.");
		} catch(Exception e) {
			System.out.println("\n\ne.getMessage()\n" + e.getMessage());
			System.out.println("\n\ne.toString()\n" + e.toString());
			System.out.println("\n\ne.printStackTrace()");
			e.printStackTrace();
		}
	}
}

public class CalculatorDemo {

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.setOprands(10, 0);	// 10 index 예외, 0으로 나누는것도 산술예외
		try {
			c1.divide();
		}catch(ArithmeticException e) {	// 같은실행문 catch구문을 실행. 위의 "0으로 나눌 수 없습니다."를 e에 넣음
			System.out.println(e.getMessage()); // getMessage가 실행됨.
		}
		
	}

}
