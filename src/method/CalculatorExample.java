package method;

public class CalculatorExample {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		
		System.out.println(cal.plus(10, 20));
		System.out.println(cal.avg(10, 20));
		
		cal.execute();
		
		cal.println("¾È³ç");
	}

}
