package getter_setter;

public class Car {
	private int speed;
	private boolean stop;

	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {//���� �⺻���� setter.
		if(speed<0) {	// ��ȿ�� �˻� �ڵ�
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
