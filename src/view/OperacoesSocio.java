package view;

import java.util.ArrayList;
import java.util.Scanner;

import controller.GestorSocio;
import model.Socio;

public class OperacoesSocio {
	public OperacoesSocio(){
		
	}
	
	public void listarSocio(){
		boolean continuar;
		ArrayList<Socio> socio = new ArrayList<Socio>();
		
		socio = GestorSocio.getSocio();
		
		for(int i = 0; i < socio.size(); i++){
			System.out.println("\n\nNome: " + socio.get(i).getNome());
			System.out.println("Localidade: " + socio.get(i).getLocalidade());
			System.out.println("Contacto: " + socio.get(i).getContacto());
			
			for(int j = 0; j < socio.get(i).getReceita().size(); j++){
				System.out.println("\nTipo: " + socio.get(i).getReceita().get(j).getTipo());
				System.out.println("Quantidade: " + socio.get(i).getReceita().get(j).getDinheiro() + "€");
				System.out.println("Mes: " + socio.get(i).getReceita().get(j).getMes());
			}
			
			continuar = Pausa.pausaLista();
			
			if(!continuar)
				break;
		}
	}
	
	public void procurarSocio(){
		String nome;
		Scanner s = new Scanner(System.in);
		
		ArrayList<Socio> socio = new ArrayList<Socio>();
		
		socio = GestorSocio.getSocio();
		
		System.out.println("\nInsira o nome do Socio: ");
		nome = s.nextLine();
		
		for(int i = 0; i < socio.size(); i++){
			if(socio.get(i).getNome().equals(nome)){
				System.out.println("\n\nNome: " + socio.get(i).getNome());
				System.out.println("Localidade: " + socio.get(i).getLocalidade());
				System.out.println("Contacto: " + socio.get(i).getContacto());
				
				for(int j = 0; j < socio.get(i).getReceita().size(); j++){
					System.out.println("\nTipo: " + socio.get(i).getReceita().get(j).getTipo());
					System.out.println("Quantidade: " + socio.get(i).getReceita().get(j).getDinheiro() + "€");
					System.out.println("Mes: " + socio.get(i).getReceita().get(j).getMes());
				}
				
				break;
			}
		}
	}
	
	public void socioMaisDinheiro(){
		int index = 0;
		double dinheiro, max = 0;
		
		ArrayList<Socio> socio = GestorSocio.getSocio();
		
		for(int i = 0; i < socio.size(); i++){
			dinheiro = 0;
			
			for(int j = 0; j < socio.get(i).getReceita().size(); j++){
				dinheiro += socio.get(i).getReceita().get(j).getDinheiro();
			}
			
			if(dinheiro > max){
				index = i; 
				max = dinheiro;
			}
		}
		
		System.out.print("\n\nO socio com mais dinheiro doado foi o: " + socio.get(index).getNome());
		System.out.print(", com um total de " + max + "€ doados");
	}
	
}
