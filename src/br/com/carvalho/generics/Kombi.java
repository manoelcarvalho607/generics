package br.com.carvalho.generics;

/**
 * 
 * @author Manoel.Carvalho
 * 
 */

public class Kombi extends Carro {
	
	private int quantidadeAssentos;
	
	
	public Kombi(String modelo, String cor, int ano, Double valor,int quantidadeAssentos) {
		super(modelo, cor, ano, valor);
		this.quantidadeAssentos = quantidadeAssentos;
	}

	

	public int getQuantidadeAssentos() {
		return quantidadeAssentos;
	}

	public void setQuantidadeAssentos(int quantidadeAssentos) {
		this.quantidadeAssentos = quantidadeAssentos;
	}
	
}
