package practice;

public class java6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub				//�迭
		String a = "a";
		int b = 1;
		
		int arrayInt[] = new int[10]; // arryInt[] �ȿ� 0���� 9������ ���� �������
		for (int i = 0; i<arrayInt.length; i++) {
			System.out.println(i);
	
		}
		
		int arrayInt2[] = {1,3,5,7,9};	
		for (int i = 0; i<arrayInt2.length; i++) { 	    // i=�׳� ����?
			System.out.println(i);
	
		}
		
		int arrayInt3[] = {1,3,5,7,9};
		for(int i = 0; i<arrayInt3.length; i++) { 		
			System.out.println(arrayInt3[i]);				//arrayInt3[i] i�� ���ԵǴ� ���ڸ� ����Ʈ
		}
		
		String arraystr[] = {"a","b","c","d","e"};
		for (int i = 0; i<arraystr.length; i++) {
			System.out.println(arraystr[i]);
	
		}
	}
	}
	


