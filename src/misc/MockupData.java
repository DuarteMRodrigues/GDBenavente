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
		
		index[0] = 1; index[1] = 2;
		GestorSocio.addSocio("Bogdan", "Sintra", 925426455, index, 2);
		
		index[0] = 5; index[1] = 9;
		GestorSocio.addSocio("Filipe", "idk", 925626445, index, 2);
		
		index[0] = 4; index[1] = 6;
		GestorSocio.addSocio("Bruno", "idk", 925626255, index, 2);
		
		index[0] = 7; index[1] = 8;
		GestorSocio.addSocio("Arroz", "Monte Capa", 925622455, index, 2);
	}
}
