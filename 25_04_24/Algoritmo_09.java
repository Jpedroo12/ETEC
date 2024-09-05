import java.util.Scanner;
public class Algoritmo_09{
	public static void main(String args[]){
		Scanner ler= new Scanner(System.in);
		int numeroint, numeroAnt, numeroSuc;
		System.out.println("Digite um número Inteiro");
		numeroint=ler.nextInt() ;
		numeroAnt= numeroint - 1;
		numeroSuc= numeroint+ 1;
        System.out.println("o numero sucessor é " + numeroSuc);
        System.out.println("o numero antecessor é " + numeroAnt);

        
	}
}
