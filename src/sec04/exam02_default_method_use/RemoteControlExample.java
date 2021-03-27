package sec04.exam02_default_method_use;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc=null;	//null로 초기화가능
		
		rc= new Television();
		rc.turnOn();
		rc.setMute(true);
		
		rc = new Audio();
		rc.turnOn();
		rc.setMute(true);
		
//		RemoteControl.setMute(true);  (X)
	}

}
