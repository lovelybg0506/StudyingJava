package sec06.exam01_interface_extends;

public class Example {

	public static void main(String[] args) {
		ImplementationC impl = new ImplementationC();
		
		InterfaceA ia = impl;
		ia.methodA();
//		ia.methodB(); 실행불가 ( A 인터페이스에는 A메소드만 있기때문)
		System.out.println();
		
		InterfaceB ib = impl;
		ib.methodB();
//		ib.methodA(); 실행불가
		System.out.println();
		
		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
		
	}

}
