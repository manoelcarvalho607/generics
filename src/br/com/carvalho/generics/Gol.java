package br.com.carvalho.generics;

/**
 * 
 * @author Manoel.Carvalho
 * 
 */

public class Gol extends Carro {
	
	private String potenciaMotor;
	
	public Gol(String modelo,String cor, int ano, Double valor, String potenciaMotor) {
		super(modelo,cor, ano, valor);
		this.potenciaMotor = potenciaMotor;
	}

	public String getPotenciaMotor() {
		return potenciaMotor;
	}

	public void setPotenciaMotor(String potenciaMotor) {
		this.potenciaMotor = potenciaMotor;
	}

	
	
	
	
	
	




}
