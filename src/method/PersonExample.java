package method;

public class PersonExample {

	public static void main(String[] args) {
		Person p1 = new Person("123456-1234567","계백");

		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
//		p1.nation = "usa"; //final 필드는 새로운값으로 대입 될 수 없다.
//		p1.ssn = "654321-7654321"; //위와 동일
		
		p1.name = "을지문덕";	
		System.out.println(p1.name);
	}

}
