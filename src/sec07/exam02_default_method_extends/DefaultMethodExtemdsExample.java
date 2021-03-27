package sec07.exam02_default_method_extends;

public class DefaultMethodExtemdsExample {

	public static void main(String[] args) {
		ChildInterface1 ci1 = new ChildInterface1() {

			@Override
			public void method1() {
				System.out.println("ci1-method1()");
				
			}

			@Override
			public void method3() {
				System.out.println("ci1-method3()");
				
			}
			
		};
		
		ci1.method1();
		ci1.method2();	// ParentInterface에 있는 default method => 재정의 하지 않아도된다.
		ci1.method3();
		System.out.println("=======================");
		
		
		ChildInterface2 ci2 = new ChildInterface2() {

			@Override
			public void method1() {
				System.out.println("ci2-method1()");
				
			}

			@Override
			public void method3() {
				System.out.println("ci2-method3()");
				
			}
			
		};
		
		ci2.method1();
		ci2.method2();	// 위에있는 ci1.method2는 부모인터페이스에 있는 default메소드 그자체를 호출했고, ci2.method2는 하위인터페이스에서 재정의한 메소드 호출.
		ci2.method3();
		System.out.println("========================");
		
		
		ChildInterface3 ci3 = new ChildInterface3() {		// 부모의 method2를 추상메소드로 바꿨기때문에 재정의를 무조건 해줘야함.

			@Override
			public void method1() {
				System.out.println("ci3-method1()");
				
			}

			@Override
			public void method3() {
				System.out.println("ci3-method3()");
				
			}

			@Override
			public void method2() {
				System.out.println("ci3-method2()");
				
			}
			
		};
		
		ci3.method1();
		ci3.method2();	
		ci3.method3();
	}

}
