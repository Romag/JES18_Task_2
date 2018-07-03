package java;

import java.util.Scanner;

public class Controller {
	private Model model;
	private View view;
	
	public Controller(Model model, View view) {
		this.model = model;
		this.view = view;
	}
	
	public void engageUser() {
		view.printInitialMessage();
		
		Scanner scan = new Scanner(System.in);
		
		boolean correctGuess = false;
		while(!correctGuess) {
			view.printRange(model.showRange());
			System.out.println(View.ENTER_YOUR_GUESS);
			correctGuess = getGuessFromUser(scan);
		}
		
	}

	private boolean getGuessFromUser(Scanner scan) {
		if(!scan.hasNextInt()) {
			view.printMessage(View.INVALID_INPUT);
			scan.next();
			return false;
		}
		
		int guess = scan.nextInt();
		if(!model.numberWithinBounds(guess)) {
			view.printMessage(View.GUESS_OUT_OF_RANGE);
			return false;
		}
		
		boolean result = model.getProposal(guess);
		if(!result) view.printMessage(View.INCORRECT_GUESS); 
		if(result) view.printMessage(View.CORRECT_GUESS);
		
		return result;
	}
}
