package TirePractice;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();

		for (int i = 1; i <= 6; i++) {
			int problemlocation = car.run();
			if(problemlocation != 0) {
				System.out.println(car.tires[problemlocation-1].location + " hankookTire로 교체");
				car.tires[problemlocation-1] = new HankookTire(car.tires[problemlocation-1].location,15);
				
			}
		
		System.out.println("----------------------------------------------");
		}
	}
}
