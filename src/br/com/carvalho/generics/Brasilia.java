package br.com.carvalho.generics;

/**
 * 
 * @author Manoel.Carvalho
 * 
 */

public class Brasilia extends Carro {
	private int quantidadePortas;
	
	public Brasilia(String modelo, String cor, int ano, Double valor, int quantidadePortas) {
		super(modelo, cor, ano, valor);
		this.quantidadePortas = quantidadePortas;
	}

	

	public int getQuantidadePortas() {
		return quantidadePortas;
	}

	public void setQuantidadePortas(int quantidadePortas) {
		this.quantidadePortas = quantidadePortas;
	}
	

}
