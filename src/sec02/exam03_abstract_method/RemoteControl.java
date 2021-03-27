package sec02.exam03_abstract_method;

public interface RemoteControl {
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	/*public abstract*/void turnOn();	//추상메소드만 써야함 > 세미콜론
	/*public abstract*/void turnOff();  //추상메소드 말고 실행블록(중괄호) 를 사용하고싶다면 public대신 default 사용.
	/*public abstract*/void setVolume(int volume);
	
}
