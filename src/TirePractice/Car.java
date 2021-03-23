package TirePractice;

public class Car {
	Tire leftfront = new Tire("왼쪽 앞바퀴", 5);
	Tire rightfront = new Tire("오른 앞바퀴", 3);
	Tire leftback = new Tire("왼쪽 뒷바퀴", 3);
	Tire rightback = new Tire("오른 뒷바퀴", 4);

	int run() {
		System.out.println("[ 자동차가 달립니다 ]");
		if (leftfront.roll() == false) {
			stop();
			return 1;
		}
		if (rightfront.roll() == false) {
			stop();
			return 2;
		}
		if (leftback.roll() == false) {
			stop();
			return 3;
		}
		if (rightback.roll() == false) {
			stop();
			return 4;
		}
		return 0;

	}

	void stop() {
		System.out.println("[ 자동차가 멈춥니다. ]");
	}
}
