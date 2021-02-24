package practice;

public class Java9 {		// 앞글자 대문자
	
		
	String a= "String" ;	//default 접근제한자  / test.java와 함께 작성함 / 같은 패키지 안에 있어야함
	public String b= "Public String" ; // public을 붙이면 같은 패키지가 아니어도 가능.
	private String c = "Private String"; // 같은 패키지 여도 안됨 . 철저히 현재class 안에서만 사용가능
	protected String d = "protected String"; // default와 거의 같음. / 차이점 : 서로 다른 패키지일때 일반적으로는 접근이 안되지만,
	
	//접근제한자를 사용하는 이유 : 보안 강화, 여러사람과 공유하며 프로그래밍 하기 위함.
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	
	}

}
