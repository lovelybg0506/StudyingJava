package practice;

public class java25 {

	public static void main(String[] args) {

//		컴퓨터는 인간과 다르게 0부터 카운팅한다.
		
//		String[] classGroup = {"강","이","박","최"};
//		System.out.println(classGroup[0]);
//		System.out.println(classGroup[1]);
//		System.out.println(classGroup[2]);
//		System.out.println(classGroup[3]);

		
		String[] classGroup = new String[4];
		
		classGroup[0] = "강";		// length는 그 배열의 길이를 알려주는것이기 때문에 모두 4가 출력되는것이당.
		System.out.println(classGroup.length);
		classGroup[1] = "이";
		System.out.println(classGroup.length);
		classGroup[2] = "박";
		System.out.println(classGroup.length);
		classGroup[3] = "최";
		System.out.println(classGroup.length);
		
	}

}
