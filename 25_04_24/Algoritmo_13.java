import java.util.Scanner;
public class Algoritmo_13 {
	public static void main(String args[]){
		
		Scanner ler= new Scanner(System.in);
		int nota1, nota2, nota3; 
		double media;
		
		System.out.println("Digite a primeira nota");
		nota1=ler.nextInt();
		System.out.println("Digite a segunda nota");
		nota2=ler.nextInt();
		System.out.println("Digite a terceira nota");
		nota3=ler.nextInt();
		media=(nota1+nota2+nota3)/3;
		System.out.println ("Sua média é = " +media);
   }

}
