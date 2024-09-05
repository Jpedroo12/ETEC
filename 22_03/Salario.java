package lista2;

public class Salario {
	public static void main (String args []) {
		//declarações de variaveis
		double salario, dependentes, beneficio, salarioFinal;
		
		salario = 1000;
		dependentes = 3;
		
		beneficio = dependentes*55;
				
		salarioFinal = beneficio + salario;
		
		System.out.println("Seu salario é " + salarioFinal);
		
	}

}
