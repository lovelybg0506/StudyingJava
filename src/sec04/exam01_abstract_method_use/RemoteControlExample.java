package sec04.exam01_abstract_method_use;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc=null;	//null로 초기화가능
		
		rc= new Television();
		rc.turnOn();
		rc.turnOff();
		
		rc=new Audio();
		rc.turnOn();
		rc.turnOff();
		
	
	}

}
