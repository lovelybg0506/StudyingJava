package practice;


public class Java9test extends Java9 { 			// protected String �� �����Ű�� ���� extends << (Java9test�� Java9�� ��ӽ�Ų��)
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Java9 t = new Java9();	
		System.out.println(t.b);	// ����Ʈ�� �ȿ� test.(Java9.java���Ͽ� �ִ� a or b)
		System.out.println(t.a); // public�� �ƴϸ� ���� ��Ű��������
//		System.out.println(t.c); // private String�̶� ����ü� ����.
		System.out.println(t.d); // protected String 
		
	}

}

