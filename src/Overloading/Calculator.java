package Overloading;

public class Calculator {
	double areaRectangle(double width) {
		System.out.print("정사각형의 넓이 : ");
		return width * width; // 정사각형의 넓이
	}

	double areaRectangle(double width, double height) {
		System.out.print("직사각형의 넓이 : ");
		return width * height; // 직사각형의 넓이
	}
	
	void println(char x) {
		System.out.println(x);
	}
	void println(int x) {
		System.out.println(x);
		
	}
	void println(double x) {
		System.out.println(x);
		
	}
	void println(float x) {
		System.out.println(x);
		
	}
	void println(char[] x) {
		System.out.println(x);
		
	}
	void println(long x) {
		System.out.println(x);
		
	}
	void println(Object x) {
		System.out.println(x);
		
	}
	void println(String x) {
		System.out.println(x);
		
	}
	void println(boolean x) {
		System.out.println(x);
		
	}
	
}
