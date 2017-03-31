package application;

import controller.GestorReceita;
import controller.GestorSocio;
import misc.MockupData;
import view.Menu;

public class App {

	public static void main(String[] args) {
		GestorSocio gs = new GestorSocio();
		GestorReceita gr = new GestorReceita();
		MockupData md = new MockupData();
		
		new Menu();
	}

}
