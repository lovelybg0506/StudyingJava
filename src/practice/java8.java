package practice;

public class java8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int intArray [] = new int[5]; // intArray��� �������ٰ� 5�� ������ŭ�� �迭�� ����. (0,1,2,3,4,5)
		
		try
		{
			intArray[3] = 10;
			intArray[6] = 1;
			
		}
		catch (Exception e)  		// Exception = ����
		{
			e.printStackTrace();		 // ���� �������� ���.
			System.out.println("�迭 ���� �ʰ�");
			System.exit(0); // ������ ���α׷� ����.
		}
	
		System.out.println("���α׷��� �������ϴ�."); 	// System.exit(0); ������ ��µ��� ����.
		
		
	
	}
		
}

