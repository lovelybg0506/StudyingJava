package getter_setter;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.setSpeed(-50); // 잘못된값이 들어갔을때 setter가 올바른 값(0)으로 셋팅을 해줌.
		System.out.println("현재 속도: "+ myCar.getSpeed());
		
		myCar.setSpeed(60);
		System.out.println("현재 속도: "+ myCar.getSpeed());

		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
		System.out.println("현재 속도: "+ myCar.getSpeed());
		
		
		
		
	}

}
