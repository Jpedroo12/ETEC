import java.util.Scanner;
public class Algoritmo_06 {
	public static void main(String args[]){
		Scanner ler= new Scanner(System.in);
		double ano, meses;
		int dias;
		
		System.out.println("Escreva a quantidade de dias:");
		dias=ler.nextInt();
		meses = dias/30;
		ano = meses/12;
		ano = dias/365;
		System.out.println("A quantidade de anos é: " +ano );
		System.out.println("A quantidade de meses é " +meses);
			
	}
}
