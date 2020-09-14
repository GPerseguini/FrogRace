package view;
import controller.Frogs;

public class Principal {

	public static void main(String[] args) {
			int distancia = 100;
	for (int frog=0;frog<5;frog++){
		Thread frogs = new Frogs(distancia);
		frogs.start();
	}
			
	}

}
