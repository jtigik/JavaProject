package br.com.jtigik;

public class ExemploBreak {

	public static void main(String[] args) {
		
		//Loop com 1000 execuções
		for (int contador=1; contador <= 1000; contador++){
			System.out.println("Esta eh a repeticao nr: "+contador);
			
			//Condição que executa a Parada do código.
			if (contador == 10)
				break;
			//Forma padrão de escrever um IF simple.
			if (contador == 10) {
				break;
			}
			//Forma prevista de escrever um IF simples.
			//if (contador == 10)break;
		}
	}
}
