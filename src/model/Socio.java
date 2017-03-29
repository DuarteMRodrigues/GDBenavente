package model;

import java.util.ArrayList;

public class Socio{
	private String nome;
	private String localidade;
	private int contacto;
	private ArrayList<Receita> receita;
	
	public Socio(String nome, String localidade, int contacto, ArrayList<Receita> receita) {
		super();
		this.nome = nome;
		this.localidade = localidade;
		this.contacto = contacto;
		this.receita = receita;
	}
	public Socio(){
		
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLocalidade() {
		return localidade;
	}
	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}

	public int getContacto() {
		return contacto;
	}
	public void setContacto(int contacto) {
		this.contacto = contacto;
	}
	
	public ArrayList<Receita> getReceita() {
		return receita;
	}
	public void setReceita(ArrayList<Receita> receita) {
		this.receita = receita;
	}
}
