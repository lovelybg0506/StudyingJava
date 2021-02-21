package practice;

public class java6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub				//배열
		String a = "a";
		int b = 1;
		
		int arrayInt[] = new int[10]; // arryInt[] 안에 0부터 9까지의 수를 담고있음
		for (int i = 0; i<arrayInt.length; i++) {
			System.out.println(i);
	
		}
		
		int arrayInt2[] = {1,3,5,7,9};	
		for (int i = 0; i<arrayInt2.length; i++) { 	    // i=그냥 순서?
			System.out.println(i);
	
		}
		
		int arrayInt3[] = {1,3,5,7,9};
		for(int i = 0; i<arrayInt3.length; i++) { 		
			System.out.println(arrayInt3[i]);				//arrayInt3[i] i에 대입되는 숫자를 프린트
		}
		
		String arraystr[] = {"a","b","c","d","e"};
		for (int i = 0; i<arraystr.length; i++) {
			System.out.println(arraystr[i]);
	
		}
	}
	}
	


