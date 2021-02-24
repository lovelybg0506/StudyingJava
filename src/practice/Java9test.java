package practice;

import practice.Java9;


public class Java9test extends Java9 { 			// protected String 을 실행시키기 위한 extends << (Java9test를 Java9에 상속시킨다)
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Java9 t = new Java9();	
		System.out.println(t.b);	// 프린트문 안에 test.(Java9.java파일에 있는 a or b)
		System.out.println(t.a); // public이 아니면 같은 패키지여야함
//		System.out.println(t.c); // private String이라 끌고올수 없음.
		System.out.println(t.d); // protected String 
		
	}

}

