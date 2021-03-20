package practice;
// 시동켜기 on, 시동끄기 off, 앞으로가기go, 뒤로가기back, 일반모드normal,시즈모드sizmode
public class tank_P {

	public final void on() {
		System.out.println("탱크에 시동을 겁니다.");
	}
	
	public void mode() {
		System.out.println("탱크가 일반모드입니다.");
	}
	
	public void go() {
		System.out.println("탱크가 앞으로 갑니다.");
	}
	
	public void back() {
		System.out.println("탱크가 뒤로 갑니다.");
	}
	
	public final void off() {
		System.out.println("탱크 시동을 끕니다.");
	}
	
}
