package main.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Model {
	private final int LOWER_BOUND = 0;
	private final int UPPER_BOUND = 100;
	private final int NUMBER_TO_GUESS;
	
	private int currentLowerBound = LOWER_BOUND;
	private int currentUpperBound = UPPER_BOUND;
	
	private List<Integer> guessLog = new ArrayList<>();
	
	public Model() {
		Random rand = new Random();
		NUMBER_TO_GUESS = rand.nextInt(101);
		
	}

	/**
	 * Receives a guess from a controller and returns answers whether it is larger or smaller than required number.
	 * if guess is correct - return 0.
	 * 
	 * @param guess
	 * @return -1, 0, 1 if required result is smaller, equal or larger
	 */
	public int getProposal(int guess) {
		
		
		return -32;
	}
	
	public boolean numberWithinBounds(int number) {
		return currentLowerBound <= number && 
				number <= currentUpperBound;
	}
	
	public String showRange() {
		return currentLowerBound + ", " + currentUpperBound; 
	}
}
