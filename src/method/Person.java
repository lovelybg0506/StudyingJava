package method;

public class Person {
	final String nation = "Korea";
	final String ssn;
	String name;
	
	public Person(String ssn,String name) {
		this.ssn = ssn;	// 파이널인데 위에서 값을 안주면 생성자에서 딱 한번 값을 줄수있다.
		this.name = name;
//		nation = "America"; // error 파이널필드로 이미 값을 줬기때문.
	}
	
}
