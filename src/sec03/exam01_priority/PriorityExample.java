package sec03.exam01_priority;

public class PriorityExample {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			Thread thread = new CalcThread("Thread" + i); // 쓰레드의 이름 셋팅
			if(i != 10) {
				thread.setPriority(Thread.MIN_PRIORITY); // ()괄호 안에 1 만 써도됨.
			}else {
				thread.setPriority(Thread.MAX_PRIORITY); // = 10
			}
			thread.start();
		}

	}

}
