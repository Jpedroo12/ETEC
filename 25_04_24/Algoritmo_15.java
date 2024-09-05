import java.util.Scanner;
public class Algoritmo_15{
	public static void main(String args[]){
		Scanner leia= new Scanner(System.in);
		double PORM, PORF, AM, AF, Total;
		System.out.println("Digite o número de alunos do genêro masculino.");
		AM=leia.nextInt();
		System.out.println("Digite o número de alunas do genêro feminino.");
		AF=leia.nextInt();
		Total= AM+AF;
		PORM= ((AM*100)/Total);
		PORF= ((AF*100)/Total);
        System.out.println("A porcentagem de meninas é: " + PORM );       
        System.out.println("A porcentagem de meninos é: " + PORF );
        
	}
}
