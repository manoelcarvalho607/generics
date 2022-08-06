package br.com.carvalho.generics;

/**
 * 
 * @author Manoel.Carvalho
 * 
 */

import java.util.ArrayList;
import java.util.List;

public class ListCar {
	
	@SuppressWarnings("unchecked")
	public static  <T> void main(String[] args) {
		System.out.println("---- Lista de Carros ----");
		System.out.println(" ");

		
		/**List com type generics chamando várias classes diferentes **/
		
		List<T> carro = new ArrayList<T>();
		carro.add((T) new Gol("gol","azul",1980, 8000d,"1.8"));
		carro.add((T) new Kombi("Kombi","branco",1970,15000d,12));
		carro.add((T) new Brasilia("Brasília","verde",1982,6000d,4));
		
		imprimir(carro);
		
	}
	
	/** método imprimir faz um forEach em cada objeto adicionado na list**/
	
	private static <T> void imprimir(List<T> carro ) {
		for ( T g : carro ) {
			System.out.println(" Modelo: " + ((Carro) g).getModelo() + " |"+ " Cor: " + ((Carro) g).getCor() + " |" +
					" Ano: "+ ((Carro) g).getAno() + " |" + " Valor: " + ((Carro) g).getValor());
			System.out.println(" ");
		}
	}


}
