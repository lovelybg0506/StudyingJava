package Overloading;

public class CalculatorExample {

	public static void main(String[] args) {
		Calculator myCal = new Calculator();
		
		double result1 = myCal.areaRectangle(10);
		System.out.println(result1);
		
		
		double result2 = myCal.areaRectangle(10, 20);
		System.out.println(result2);

		myCal.println(false);
		myCal.println('d');
		myCal.println(15.9);
		myCal.println(123.123f);
		myCal.println('a'+'a');
		
		
	}

}
