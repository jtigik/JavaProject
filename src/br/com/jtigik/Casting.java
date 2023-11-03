package br.com.jtigik;

public class Casting {
	
	//Casting Implícito, feito de forma automática 
	//(quando compatíveis entre si).
	
	//Casting Explícito, feito de forma automática 
	//(quando realizamos a converção direta).
	
	/*As converções para tipos diferentes deve 
	respeitar a Classe do caractere, bem como o 
	tamanho que este ocupa em espaço de memória (tabela ASCII).
	*/
	
	public static void main(String args[]) {
//=========================================================
		//Converção com perda!

		int num = 10124422;
		short num1 = (short)num;
		
		System.out.printf("Inteiro: %d\n", num);
		System.out.printf("Short: %d\n", num1);
//=========================================================
		//Converção sem perdas
		
		long numL = 171121131111811511L;
		int numI = (int) numL;
		int idade = 10;
		
		long idadeL = idade;
		
		byte b = 1;
		short s = b;
		
		byte b1 = (byte) s;
		int i = b1;
		
		int i1 = 1;
		byte s1 = (byte) i1;
		long l = i1;
		
		long l1 = 1010101;
		short l2 = (short) l1;
		
		System.out.printf("Idade Long: %d\n", idadeL);
		System.out.printf("Inteiro: %d\n", numI);
		System.out.printf("Long: %d\n", numL);
		
		
	}
	
	
}
