package main.java;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Model model = new Model();
		View view = new View();
		
		Controller controller = new Controller(model, view);
		controller.engageUser();
		
		
	}

}
