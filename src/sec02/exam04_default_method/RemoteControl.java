package sec02.exam04_default_method;

public interface RemoteControl {
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	void turnOn();	
	void turnOff();  
	void setVolume(int volume);
	
	default void setMute(boolean mute){		//추상메소드 말고 실행블록(중괄호) 를 사용하고싶다면 public대신 default 사용.
		if(mute) {
			System.out.println("무음 처리합니다.");
		}else {
			System.out.println("무음 해제합니다.");
		}
	}
	
	
}
