package method;

public class Singleton {
	
	private static Singleton st = new Singleton();	// 2. �ʵ忡 private�� static�� ����ؼ� �ڽ��� ��ü�� �����Ѵ�.
	
	private Singleton() {		// 1.�����ڿ� private ���ش�.
	}
	
	static Singleton getInstance() {  // 3. static class getInstane , getInstance�� ����ؼ� ���� ��ü�� ���Ͻ�Ų��.
		return st;
	}
	
}
