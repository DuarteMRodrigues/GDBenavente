package view;

import java.util.ArrayList;

import controller.GestorReceita;
import model.Receita;

public class OperacoesReceita {
	public OperacoesReceita(){
		
	}
	
	public void mesMaisRendeu(){
		int index = 0;
		double valores[] = new double[12], max = 0;
		ArrayList<Receita> receita = GestorReceita.getReceita();
		
		for(int i = 0; i < receita.size(); i++){
			if(receita.get(i).getMes().equals("Janeiro"))
				valores[0] += receita.get(i).getDinheiro();
			
			else if(receita.get(i).getMes().equals("Fevereiro"))
				valores[1] += receita.get(i).getDinheiro();
			
			else if(receita.get(i).getMes().equals("Março"))
				valores[2] += receita.get(i).getDinheiro();
			
			else if(receita.get(i).getMes().equals("Abril"))
				valores[3] += receita.get(i).getDinheiro();
			
			else if(receita.get(i).getMes().equals("Maio"))
				valores[4] += receita.get(i).getDinheiro();
			
			else if(receita.get(i).getMes().equals("Junho"))
				valores[5] += receita.get(i).getDinheiro();
			
			else if(receita.get(i).getMes().equals("Julho"))
				valores[6] += receita.get(i).getDinheiro();
			
			else if(receita.get(i).getMes().equals("Agosto"))
				valores[7] += receita.get(i).getDinheiro();
			
			else if(receita.get(i).getMes().equals("Setembro"))
				valores[8] += receita.get(i).getDinheiro();
			
			else if(receita.get(i).getMes().equals("Outubro"))
				valores[9] += receita.get(i).getDinheiro();
			
			else if(receita.get(i).getMes().equals("Novembro"))
				valores[10] += receita.get(i).getDinheiro();
			
			else if(receita.get(i).getMes().equals("Dezembro"))
				valores[11] += receita.get(i).getDinheiro();
		}
	
		for(int i = 0; i < 12; i++){
			if(valores[i] > max){
				index = i;
				max = valores[i];
			}
		}
		
		if(index == 0)
			System.out.println("\n\nO mes que rendeu mais foi o mes de Janeiro, com um total de " + max + "€ rendidos");
		
		else if(index == 1)
			System.out.println("\n\nO mes que rendeu mais foi o mes de Fevereiro, com um total de " + max + "€ rendidos");
		
		else if(index == 2)
			System.out.println("\n\nO mes que rendeu mais foi o mes de Março, com um total de " + max + "€ rendidos");
		
		else if(index == 3)
			System.out.println("\n\nO mes que rendeu mais foi o mes de Abril, com um total de " + max + "€ rendidos");
		
		else if(index == 4)
			System.out.println("\n\nO mes que rendeu mais foi o mes de Maio, com um total de " + max + "€ rendidos");
		
		else if(index == 5)
			System.out.println("\n\nO mes que rendeu mais foi o mes de Junho, com um total de " + max + "€ rendidos");
		
		else if(index == 6)
			System.out.println("\n\nO mes que rendeu mais foi o mes de Julho, com um total de " + max + "€ rendidos");
		
		else if(index == 7)
			System.out.println("\n\nO mes que rendeu mais foi o mes de Agosto, com um total de " + max + "€ rendidos");
		
		else if(index == 8)
			System.out.println("\n\nO mes que rendeu mais foi o mes de Setembro, com um total de " + max + "€ rendidos");
		
		else if(index == 9)
			System.out.println("\n\nO mes que rendeu mais foi o mes de Outubro, com um total de " + max + "€ rendidos");
		
		else if(index == 10)
			System.out.println("\n\nO mes que rendeu mais foi o mes de Novembro, com um total de " + max + "€ rendidos");
		
		else if(index == 11)
			System.out.println("\n\nO mes que rendeu mais foi o mes de Dezembro, com um total de " + max + "€ rendidos");
	}
	
	public void tiposReceitas(){
		double valores[] = new double[2];
		ArrayList<Receita> receita = GestorReceita.getReceita();
		
		for(int i = 0; i < receita.size(); i++){
			if(receita.get(i).getTipo().equals("Donativo")){
				valores[0] += receita.get(i).getDinheiro();
			}
			
			else if(receita.get(i).getTipo().equals("Bilheteira")){
				valores[1] += receita.get(i).getDinheiro();
			}
		}
		
		System.out.println("\n\nDinheiro angariado em Donativos: " + valores[0] + "€");
		System.out.print("Dinheiro angariado com a Bilheteira: " + valores[1] + "€");
	}
}
