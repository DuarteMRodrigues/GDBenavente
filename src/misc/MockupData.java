package misc;

import java.util.ArrayList;

import controller.GestorReceita;
import controller.GestorSocio;

public class MockupData {
	public MockupData(){
		int index[] = new int[100];
		
		GestorReceita.addReceita("Donativo", 500, "Janeiro");
		GestorReceita.addReceita("Bilheteira", 10, "Janeiro");
		GestorReceita.addReceita("Bilheteira", 10, "Dezembro");
		GestorReceita.addReceita("Bilheteira", 10, "Agosto");
		GestorReceita.addReceita("Donativo", 124, "Julho");
		GestorReceita.addReceita("Donativo", 1000, "Abril");
		GestorReceita.addReceita("Bilheteira", 10, "Janeiro");
		GestorReceita.addReceita("Bilheteira", 10, "Marco");
		GestorReceita.addReceita("Donativo", 215, "Outubro");
		GestorReceita.addReceita("Bilheteira", 10, "Fevereiro");
		
		
		index[0] = 0; index[1] = 3;
		GestorSocio.addSocio("Duarte", "Azeitao", 925626455, index, 2);
	}
}
