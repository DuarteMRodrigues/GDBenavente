package view;

import java.util.Scanner;

public class Pausa {
	public Pausa(){
		Scanner s = new Scanner(System.in);
		System.out.print("\n\nPressione a tecla [ENTER] para continuar...");
		s.nextLine();
	}
	
	public static boolean pausaLista(){
		String cont;
		Scanner s = new Scanner(System.in);
		
		System.out.print("\n\nInsira 0 para parar a listagem e qualquer valor para continuar...");
		cont = s.nextLine();
		
		if(cont.equals("0"))
			return false;
		else
			return true;
	}
}
