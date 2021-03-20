package method;

public class Singleton {
	
	private static Singleton st = new Singleton();	// 2. 필드에 private과 static을 사용해서 자신의 객체를 생성한다.
	
	private Singleton() {		// 1.생성자에 private 써준다.
	}
	
	static Singleton getInstance() {  // 3. static class getInstane , getInstance를 사용해서 만든 객체를 리턴시킨다.
		return st;
	}
	
}
