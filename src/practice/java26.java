package practice;

import java.io.IOException;
import java.io.InputStreamReader;

public class java26 {

	public static void main(String[] args) {

		InputStreamReader rd=new InputStreamReader(System.in);
		char lowerBound;
		System.out.print("���ĺ� �� ���ڸ� �Է��ϼ��� : ");
		char c=0;
		int i,j;
		
		try {
			c=(char)rd.read();			// ���⸦ �о����� � ������ �߻��ϸ�,
		} catch(IOException e) {		// ���⼭ ��Ƴ� ��
			System.out.println("Ű���� �Է� �� ������ �߻��߽��ϴ�."); // �̷��� ó�� �ϰڴ�.
		}
		if((c>'a'||c<'z') && (c<'A'&&c<'Z')) {
			System.out.println("���ĺ� ���ڰ� �ƴմϴ�.");		// ���⼭ ���ĺ����� �ƴ� ���ڵ��� ��� �ɷ�����.
		}
		if(c>'a'&&c<'z') {
			lowerBound='a';
		}else
			lowerBound='A';
		for(i=c;i>=lowerBound;i--) {	// 'd'�� �Է������� abc���� ������ ������ i--������ ���� j���ǹ� �ٿ��� c�� ���ϱ⶧��?
			for(j=lowerBound;j<i;j++) {  // j<i�� ������ ������ i-1 �Ǿ �������⶧���� �Է��� ���ĺ��� ������ ���ĺ����� �����°Ͱ���
				System.out.print((char)j);
			}
			System.out.println();
		}
	}

}
