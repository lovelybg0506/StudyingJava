package sec07.exam01_promotion_access;

public class Child extends Parent {
//	오버라이딩
	
	@Override
	public void method2() {
		System.out.println("Child - method2()");
	}
	
	public void method3() {
		System.out.println("Child - method3()");
	}
}
