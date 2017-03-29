package controller;

import java.util.ArrayList;

import model.Receita;

public class GestorReceita {
	private static ArrayList<Receita> alReceita;
	
	public GestorReceita(){
		alReceita  = new ArrayList<Receita>();
	}
	
	public static void addReceita(String tipo, double dinheiro, String mes){
		Receita receita = new Receita(tipo, dinheiro, mes);
		
		alReceita.add(receita);
	}
	
	public static ArrayList<Receita> getReceita(){
		return alReceita;
	}
}
