package practice;

public class java23 {

	public static void main(String[] args) {
			// 500���� 1000������ ¦����,Ȧ���� ���ϱ�
		
		int num;
		int sum1,sum2;
		
		sum1=0;
		sum2=0;
		
		for(num=500;num<=1000;num++) {
			if(num % 2 == 0)
				sum2 += num;
			else
				sum1 += num;
		}
		System.out.printf("500���� 1000���� ¦���� �� : %d \n",sum2);
		System.out.printf("500���� 1000���� Ȧ���� �� : %d \n",sum1);
	}

}
