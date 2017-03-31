package view;

import java.util.Scanner;

public class Menu {
	public Menu(){
		int escolha;
		Scanner s = new Scanner(System.in);
		
		OperacoesSocio os = new OperacoesSocio();
		OperacoesReceita or = new OperacoesReceita();
		
		do{
			System.out.println("\n\n\n\t\t\t\t\t---------------Menu Principal--------------");
			System.out.println("1 - Listar Socios");
			System.out.println("2 - Procurar Socio");
			System.out.println("3 - Socio que douo mais");
			System.out.println("4 - Mes com mais rendimento");
			System.out.println("5 - Dinheiro de cada tipo");
			System.out.println("99 - Sair");
			escolha = s.nextInt();
			s.nextLine();
			
			switch(escolha){
				case 1:
					os.listarSocio();
					break;
					
				case 2:
					os.procurarSocio();
					break;
					
				case 3:
					os.socioMaisDinheiro();
					break;
					
				case 4:
					or.mesMaisRendeu();
					break;
					
				case 5:
					or.tiposReceitas();
					break;
					
				case 99:
					System.out.println("\n\nAdeus");
					break;
					
				default:
					System.out.println("\n\nEscolha Invalida");
					break;
			}
			
			new Pausa();
		}while(escolha != 99);
	}
}
