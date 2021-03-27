package sec07.exam02_default_method_extends;

public interface ChildInterface3 extends ParentInterface {

	public void method2();	// 부모인터페이스에 있는 default메소드를 추상메소드로 바꿔버리고 반드시 재정의하도록만듦.
	public void method3();
	
}
