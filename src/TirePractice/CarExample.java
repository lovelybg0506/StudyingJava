package TirePractice;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();

		for (int i = 1; i <= 6; i++) {
			int problemlocation = car.run();
			switch (problemlocation) {
			case 1:
				System.out.println("앞 왼쪽 KumhoTire로 교체");
				car.leftfront = new KumhoTire("왼쪽 앞바퀴", 10);
				break;
			case 2:
				System.out.println("앞 오른 HankookTire로 교체");
				car.rightfront = new HankookTire("오른 앞바퀴", 10);
				break;
			case 3:
				System.out.println("뒤 왼쪽 KumhoTire로 교체");
				car.leftback = new KumhoTire("왼쪽 뒷바퀴", 10);
				break;
			case 4:
				System.out.println("뒤 오른 HankookTire로 교체");
				car.rightback = new HankookTire("오른 뒷바퀴", 10);
				break;

			}

		}
		System.out.println("----------------------------------------------");
	}

}
