package ua.training.java;

public class View {
	public static final String INITIAL_MESSAGE = "Number is guessed by program.";
	
	public static final String RANGE_IS = "Range is: ";
	
	public static final String ENTER_YOUR_GUESS = "Please, enter your guess.";
	
	public static final String INVALID_INPUT = "Your input is not a number. Pease try again.";
	
	public static final String GUESS_OUT_OF_RANGE = "Your guess is out of range. Please try again.";
	
	public static final String INCORRECT_GUESS = "Guess is not correct. Please try again.";
	
	public static final String CORRECT_GUESS = "Congratulations. You have guessed correctly!";
	
	
	public void printMessage(String s) {
		System.out.println(s);
	}
	
	public void printNumber(int n) {
		System.out.println(n);
	}
	
	public void printNumber(String message, int n) {
		System.out.println(message);
		printNumber(n);
	}
	
	public void printInitialMessage() {
		System.out.println(INITIAL_MESSAGE);
	}
	
	public void printRange(String range) {
		System.out.println(RANGE_IS + range);
	}
}
