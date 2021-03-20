package practice;

public class tank_Son extends tank_P {

	public static final int NORMAL_MODE = 1;
	public static final int SIZ_MODE = 2;
	
	public int tankmode = NORMAL_MODE;
	
	public void mode() {
		if(tankmode == SIZ_MODE) {
			System.out.println("탱크를 시즈모드로 변경합니다.");
		}else {
			super.mode();
		}
	}
	
}
