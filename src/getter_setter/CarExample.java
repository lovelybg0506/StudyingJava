package getter_setter;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.setSpeed(-50); // �߸��Ȱ��� ������ setter�� �ùٸ� ��(0)���� ������ ����.
		System.out.println("���� �ӵ�: "+ myCar.getSpeed());
		
		myCar.setSpeed(60);
		System.out.println("���� �ӵ�: "+ myCar.getSpeed());

		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
		System.out.println("���� �ӵ�: "+ myCar.getSpeed());
		
		
		
		
	}

}
