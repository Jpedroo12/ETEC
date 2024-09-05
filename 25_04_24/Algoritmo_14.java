import java.util.Scanner;
public class Algoritmo_14 {
	public static void main(String args[]){
		Scanner ler= new Scanner(System.in);
		double preco, desc, valorDesc, prod;
		System.out.println("Digite o valor do produto:");
		preco=ler.nextDouble();
		System.out.println("Digite a porcentagem do desconto");
		desc=ler.nextDouble();
		valorDesc=(desc/100)*preco;
		prod=preco-valorDesc;
		System.out.println("O valor do seu produto com desconto é " + prod);
	
  }

}
