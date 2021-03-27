package sec02.exam02_constant_field;

public interface RemoteControl {
/*public static final*/int MAX_VOLUME = 10;   // 무조건 초기값지정.
	int MIN_VOLUME = 0;
	
//	static {                //클래스처럼 정적블록에 초기화할 수 없음.
//		MIN_VOLUME = 0;
//	}
	
}
