package practice;

public class java3 {

	//실행함수 (메인함수)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Gyujava = "공부하고있다";
		int a = 1;
		int b = 0;
		
		
		
		
		if(Gyujava == "공부를 안하고있다") { //만약에 () 라면... 중괄호 내부를 실행.
			System.out.print("잘하고 있습니다.");
		} 
		else if(Gyujava == "공부하고있다") {
			System.out.println("잘하고 있습니다.");
		}
		else if(Gyujava == "공부하고있다람") {
			System.out.print("잘하고 있습니다.");
		}
		else if(Gyujava == "공부하고있다람쥐") {
			System.out.print("잘하고 있습니다.");
		}
		else if(Gyujava == "공부하고있다람쥐s") {
			System.out.print("잘하고 있습니다.");
		


		}
		if(a == 0) {
			System.out.print("a는 0입니다.");
		}else if(a == 1) {
			System.out.println("a는 1입니다.");
		}

		// and 연산자 , or 연산자
		if(b == 0 && a == 1) { 		//and 연산자 사용 *(&&=and)
			System.out.println("TEST");
		}
	
		if(a == 0 || a == 1) { 		// or 연산자 사용 *(|| = or )  shift 누른채로 \ 누르면 | 됨.
			System.out.println("TEST2");
		}
				}
			}

