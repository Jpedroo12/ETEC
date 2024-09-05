package algoritmos;
import java.util.Scanner;
public class triangulo {
	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		double A,B,C;
		System.out.println("Digite o primeiro valor do triangulo");
		A=ler.nextDouble();
		System.out.println("Digite o segundo valor do triângulo");
		B=ler.nextDouble();
		System.out.println("Digite o segundo valor do triângulo");
		C=ler.nextDouble();
		if (A == B && B == C) {
			System.out.println("O triângulo e equilatero");
		} else if (A!= B && B!=C && A!=C) {
			System.out.println("O triangulo e escaleno");
		} else {
			System.out.println("o triangulo e isosceles");
		}
	ler.close();
		
	}

}
