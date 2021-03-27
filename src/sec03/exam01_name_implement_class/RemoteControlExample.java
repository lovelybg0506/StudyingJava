package sec03.exam01_name_implement_class;

public class RemoteControlExample {

	public static void main(String[] args) {
//		RemoteControl rc = new RemoteControl();  interface는 스스로의 객체를 만들수 없다.
		
		RemoteControl rc;
		rc = new Television();
		
		rc.turnOn();
		rc.turnOff();

		rc = new Audio();

	}

}
