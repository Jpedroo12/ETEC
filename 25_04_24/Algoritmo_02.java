import java.util.Scanner;
public class Algoritmo_02 {
	public static void main(String args[]){
		Scanner ler= new Scanner(System.in);
		double nota1, nota2, media;
		System.out.println("Digite a primeira nota");
		nota1=ler.nextDouble();
		System.out.println("Digite a segunda nota");
		nota2=ler.nextDouble();
		media=(nota1+nota2)/2;
		System.out.println ("Sua média é = " +media);
	
	}
}
