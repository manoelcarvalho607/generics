package br.com.carvalho.generics;

/**
 * 
 * @author Manoel.Carvalho
 * 
 * 
 */

public abstract class Carro {
	
	private String modelo;
	private String cor;
	private int ano;
	private Double valor;
	
	
	public Carro(String modelo, String cor, int ano, Double valor) {
		this.modelo = modelo;
		this.cor = cor;
		this.ano = ano;
		this.valor = valor;
	}
	
	
	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	
	

	
}
