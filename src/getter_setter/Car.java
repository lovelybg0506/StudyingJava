package getter_setter;

public class Car {
	private int speed;
	private boolean stop;

	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {//가장 기본적인 setter.
		if(speed<0) {	// 유효성 검사 코드
			this.speed = 0;
			return;
		}else {			
			this.speed = speed;
		}
	}
	
	public boolean isStop() {
		return stop;
	}
	

	public void setStop(boolean stop) {
		this.stop = stop;
		if(stop == true) {
			speed = 0;
		}
	}
	
	
}
