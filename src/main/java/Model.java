package main.java;

import java.util.Random;

public class Model {
	private final int LOWER_BOUND = 0;
	private final int UPPER_BOUND = 100;
	private final int NUMBER_TO_GUESS;
	
	private int currentLowerBound = LOWER_BOUND;
	private int currentUpperBound = UPPER_BOUND;
	
	
	public Model() {
		Random rand = new Random();
		NUMBER_TO_GUESS = rand.nextInt(101);
	}

}
