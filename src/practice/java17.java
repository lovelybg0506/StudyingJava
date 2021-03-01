package practice;

public class java17 {

	public static void main(String[] args) {

		 int i = 3;
		 i++;
		 System.out.println();
		 ++i;
		 System.out.println(i);
		 System.out.println(++i);	// ++i는 괄호 안에서 +1이 되면서 끝나고
		 System.out.println(i++);	// i++은 괄호 밖, 세미콜론(;) 다음부터 +1 이므로
		 System.out.println(i);		// 여기에서 +1이 되어서 출력됨.


	}

}
