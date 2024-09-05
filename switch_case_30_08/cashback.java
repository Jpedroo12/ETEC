package tpa;
import java.util.Scanner;
public class cashback {
	public static void main(String[] args) {
    Scanner ler= new Scanner(System.in);
    double valor, cashback;
    System.out.println("digite o valor da sua compra");
    valor= ler.nextDouble();
	if (valor<=100) {
		cashback= valor *0.05;                    
		System.out.println("O valor do cashback é : "+cashback+" ");		
		}
	else if (valor<=1000) {
		cashback= valor *0.08;                    
		System.out.println("O valor do cashback é : "+cashback+" ");
		
		}
	else if (valor<=2000) {
		cashback= valor *0.10;                    
		System.out.println("O valor do cashback é : "+cashback+" ");
		
		}
	else if (valor<=5000) {
		cashback= valor *0.12;                    
		System.out.println("O valor do cashback é : "+cashback+" ");		
		}
	else if (valor>5000) {
		cashback= valor *0.15;                    
		System.out.println("O valor do cashback é : "+cashback+" ");		
		}
	}

}
