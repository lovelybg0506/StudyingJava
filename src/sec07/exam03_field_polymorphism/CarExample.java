package sec07.exam03_field_polymorphism;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();
		
		for(int i=1; i<=5; i++) {
			int problemLocation = car.run();
			switch(problemLocation) {
			case 1:
				System.out.println("앞 왼쪽 HankookTire로 교체");
				car.frontLeftTire = new HankookTire("앞왼쪽",15);
				break;
			case 2:
				System.out.println("앞 오른쪽 기본 Tire로 교체");
				car.frontRightTire = new Tire("앞 오른쪽",2);
				break;
			case 3:
				System.out.println("뒤 왼쪽 HankookTire로 교체");
				car.backLeftTire = new HankookTire("뒤 왼쪽",14);
				break;
			case 4:
				System.out.println("뒤 오른쪽 HankookTire로 교체");
				car.backRightTire = new HankookTire("뒤 오른쪽",17);
				break;
			}
			System.out.println("---------------------------");
		}

	}

}
