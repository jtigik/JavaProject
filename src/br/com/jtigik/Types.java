package br.com.jtigik;

public class Types {
	private Long codigo;
	private String nome;
	private Long variavel;
	private Integer numero;
	private Double valorDecimal = 10.1;
	private Boolean status = true;
	private Float pontoDecimal = 10.0f;
	private Short shor;
	private Byte bit;
	private Character letra = 'A';
	
	//Converção de Complexo para Primitivo (Autoboxing).
	Boolean a = true;
	Integer idade = 10;
	Character c = 'A';
	Long cpf1 = 1312231213L;
	
/*	Converção de Primitivo para Complexo (Unboxing).
	Tipos de dados complexos possuem métodos 
	auxiliares, diferentemente dos tipos Primitivos.*/
	
	boolean status1 = Boolean.FALSE;
	int num1 = Integer.valueOf(1234);
	long cpf2 = Long.valueOf(1234);
	char e = Character.valueOf('B');
	
	//Atribuição de valores aos tipos Complexos.
	Boolean status2 = Boolean.TRUE;
	Long cpf = Long.valueOf(1312231213);
	Integer num = Integer.valueOf(1234);
	Character d = Character.valueOf('B');
	
}
