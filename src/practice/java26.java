package practice;

import java.io.IOException;
import java.io.InputStreamReader;

public class java26 {

	public static void main(String[] args) {

		InputStreamReader rd=new InputStreamReader(System.in);
		char lowerBound;
		System.out.print("알파벳 한 문자를 입력하세요 : ");
		char c=0;
		int i,j;
		
		try {
			c=(char)rd.read();			// 여기를 읽었을대 어떤 에러가 발생하면,
		} catch(IOException e) {		// 여기서 잡아낸 후
			System.out.println("키보드 입력 중 오류가 발생했습니다."); // 이렇게 처리 하겠다.
		}
		if((c>'a'||c<'z') && (c<'A'&&c<'Z')) {
			System.out.println("알파벳 문자가 아닙니다.");		// 여기서 알파벳들이 아닌 문자들을 모두 걸러버림.
		}
		if(c>'a'&&c<'z') {
			lowerBound='a';
		}else
			lowerBound='A';
		for(i=c;i>=lowerBound;i--) {	// 'd'를 입력했을때 abc까지 나오는 이유가 i--때문에 다음 j조건문 줄에서 c로 변하기때문?
			for(j=lowerBound;j<i;j++) {  // j<i에 위에서 내려온 i-1 되어서 내려오기때문에 입력한 알파벳을 제외한 알파벳들이 나오는것같다
				System.out.print((char)j);
			}
			System.out.println();
		}
	}

}
