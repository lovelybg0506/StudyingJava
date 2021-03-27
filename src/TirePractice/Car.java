package TirePractice;

public class Car {
	Tire[] tires = { new Tire("왼쪽 앞바퀴", 5),
			new Tire("오른 앞바퀴", 3),
			new Tire("왼쪽 뒷바퀴", 3),
			new Tire("오른 뒷바퀴", 4)
			};
//	Tire leftfront = new Tire("왼쪽 앞바퀴", 5);
//	Tire rightfront = new Tire("오른 앞바퀴", 3);
//	Tire leftback = new Tire("왼쪽 뒷바퀴", 3);
//	Tire rightback = new Tire("오른 뒷바퀴", 4);

	int run() {
		System.out.println("[ 자동차가 달립니다 ]");
		for(int i=0; i<tires.length;i++) {
			if(tires[i].roll()==false) {
				stop();
				return (i+1);
			}
		}
		return 0;
	}

	void stop() {
		System.out.println("[ 자동차가 멈춥니다. ]");
	}
}
