package controller;

import java.util.ArrayList;

import model.Receita;
import model.Socio;

public class GestorSocio {
	private static ArrayList<Socio> alSocio;
	
	public GestorSocio(){
		alSocio  = new ArrayList<Socio>();
	}
	
	public static void addSocio(String nome, String localidade, int contacto, int[] index, int qtd){
		ArrayList<Receita> allReceita = GestorReceita.getReceita();
		ArrayList<Receita> receita = new ArrayList<Receita>();
		
		for(int i = 0; i < qtd; i++){
			for(int j = 0; j < allReceita.size(); j++){
				if(index[i] == j){
					receita.add(allReceita.get(j));
					break;
				}
			}
		}
		
		Socio socio = new Socio(nome, localidade, contacto, receita);
		
		alSocio.add(socio);
	}
	
	public static ArrayList<Socio> getSocio(){
		return alSocio;
	}
	
}
