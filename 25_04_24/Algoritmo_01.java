import java.util.Scanner;
public class Algoritmo_01 {
	public static void main(String args[]){
		Scanner ler= new Scanner(System.in);
		double base, altura, area;
		System.out.println("Digite a base do triângulo retângulo");
		base=ler.nextDouble();
		System.out.println("Digite a altura do triângulo retângulo");
		altura=ler.nextDouble ();
		area= base*altura/2;
		System.out.println ("A área do triangulo é "+ area);
		
	}
		
}