package method;

public class SingletonExample {

	public static void main(String[] args) {
//		Singleton obj1 = new Singleton(); // �ܺο��� ��ü�� �������� ���ϰ� private���� ���Ƽ� �����Ͽ���.

		Singleton obj1 = Singleton.getInstance(); // �̱��� ��ü
		Singleton obj2 = Singleton.getInstance(); // obj 1�� obj2�� �����ϴ� ��ü�� ����.
		
		if(obj1 == obj2) {
			System.out.println("�����ϴ� ��ü�� �����ϴ�.");
		}else {
			System.out.println("�����ϴ� ��ü�� �ٸ��ϴ�.");
		}
	}

}
