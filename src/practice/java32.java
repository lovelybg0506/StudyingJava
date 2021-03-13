package practice;

class Calculator{
	int left, right;
	
	public void setOprands(int left, int right) {
		this.left=left;
		this.right=right;
	}
	public void sum() {
		System.out.println(this.left+this.right);
	}
	public void avg() {
		System.out.println((this.left+this.right)/2);
	}
}

public class java32 {

	public static void main(String[] args) {
		
		Calculator c1 = new Calculator();		// 좌측의 Calculator = 데이터타입,	우측의 Calculator 클래스
		c1.setOprands(10,20);				// 객체를 만든다 = 데이터타입을 우리가 직접 만드는것이다.
		c1.sum();
		c1.avg();
		
		Calculator c2 = new Calculator();
		c2.setOprands(20,40);
		c2.sum();
		c2.avg();
		
		

	}

}
