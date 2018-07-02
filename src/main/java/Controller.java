package main.java;

import java.util.Scanner;

public class Controller {
	private Model model;
	private View view;
	
	public Controller(Model model, View view) {
		this.model = model;
		this.view = view;
	}
	
	public void engageUser() {
		view.printInitialMessage(model.showRange());
		
		Scanner scan = new Scanner(System.in);
		
	}

}
