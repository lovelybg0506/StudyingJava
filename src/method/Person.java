package method;

public class Person {
	final String nation = "Korea";
	final String ssn;
	String name;
	
	public Person(String ssn,String name) {
		this.ssn = ssn;	// ���̳��ε� ������ ���� ���ָ� �����ڿ��� �� �ѹ� ���� �ټ��ִ�.
		this.name = name;
//		nation = "America"; // error ���̳��ʵ�� �̹� ���� ��⶧��.
	}
	
}
