package sec03.exam01_noname_implement_class;

public interface RemoteControl {
	int MAX_VOLUME = 10;			/* 상수 */
	int MIN_VOLUME = 0;
	
	void turnOn();				/* 추상메소드 */
	void turnOff();  
	void setVolume(int volume);
	
	default void setMute(boolean mute){		/* default 메소드*/
		if(mute) {
			System.out.println("무음 처리합니다.");
		}else {
			System.out.println("무음 해제합니다.");
		}
	}
	
	
	static void changeBattery() { 	/*static(정적) 메소드*/
		System.out.println("건전지를 교환합니다.");
	}
	
}
