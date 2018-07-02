package main.java;

public class View {

	
	public void printNumber(int n) {
		System.out.println(n);
	}
	
	public void printNumber(String message, int n) {
		System.out.println(message);
		printNumber(n);
	}
}
