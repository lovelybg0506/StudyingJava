package practice;

public class java29 {

	public static void main(String[] args) { // 4x+5y=60 의 모든 해를 구해라 (x,y) 형태로 출력.  단) x,y는10이하의 자연수
			
		int x,y;
		
		for(x=1;x<=10;x++) {
			for(y=1;y<=10;y++) {
				if((4*x)+(5*y)==60) {
					System.out.println("("+x+","+y+")");
				}
			}
		}

	}

}
