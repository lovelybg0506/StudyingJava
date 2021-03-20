package method;

public class SingletonExample {

	public static void main(String[] args) {
//		Singleton obj1 = new Singleton(); // 외부에서 객체를 생성하지 못하게 private으로 막아서 컴파일오류.

		Singleton obj1 = Singleton.getInstance(); // 싱글톤 객체
		Singleton obj2 = Singleton.getInstance(); // obj 1과 obj2가 참조하는 객체는 같다.
		
		if(obj1 == obj2) {
			System.out.println("참조하는 객체가 같습니다.");
		}else {
			System.out.println("참조하는 객체가 다릅니다.");
		}
	}

}
