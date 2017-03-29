package model;

public class Receita {
	private String tipo;
	private double dinheiro;
	private String mes;

	public Receita(String tipo, double dinheiro, String mes) {
		super();
		this.tipo = tipo;
		this.dinheiro = dinheiro;
		this.mes = mes;
	}
	public Receita(){
		
	}

	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getDinheiro() {
		return dinheiro;
	}
	public void setDinheiro(double dinheiro) {
		this.dinheiro = dinheiro;
	}

	public String getMes() {
		return mes;
	}
	public void setMes(String mes) {
		this.mes = mes;
	}
}
