package sec07.exam01_promotion_access;

public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child;	// 부모타입으로 자동 타입변환
		
		parent.method1(); // Parent 에만 있는 method1을 호출.
		
		parent.method2(); // Child 에서 오버라이딩한 method2를 호출.
		
//		parent.method3(); // Child 에만 있어서 호출할 수 없음.

		child.method3(); 
	}

}
