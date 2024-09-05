import java.util.Scanner;
public class Algoritmo_12 {
	public static void main(String args[]){
		Scanner ler= new Scanner(System.in);
		int salario, depen, novo;
		
		System.out.println ("Digite o salário");
		salario=ler.nextInt();
		System.out.println ("Digite o número de dependentes");
		depen=ler.nextInt();
		novo=salario+(depen*55);
		System.out.println ("Seu salario com dependentes é " +novo );
				
		
	}

}
