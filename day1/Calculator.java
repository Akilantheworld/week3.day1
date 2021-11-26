package week3.day1;

public class Calculator {

	public  void sub(int num1, int num2) {
		System.out.println(num1-num2);
	}
	public void sub (double num1, double num2) {
		System.out.println(num1-num2);
	}
	public void add (int num1, int num2) {
		System.out.println(num1+num2);
	}
	public void add(double num1, double num2) {
		System.out.println(num1+num2);
	}
	public void multiply (int num1, int num2) {
		System.out.println(num1*num2);
	}
	public void multiply (double num1, double num2) {
		System.out.println(num1*num2);
	}
	public void div (int num1, int num2) {
		System.out.println(num1/num2);
	}
	public void div (double num1, double num2) {
		System.out.println(num1/num2);
	}

	public static void main(String[] args) {
		Calculator Calc=new Calculator();
		Calc.sub(20, 15);
		Calc.sub(21, 15);
		Calc.add(10, 60);
		Calc.add(5, 6);
		Calc.multiply(5, 6);
		Calc.multiply(8, 2);
		Calc.div(60, 12);
		Calc.div(72, 9);
	}
	
}
