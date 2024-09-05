package algoritmos;
import java.util.Scanner;
public class Notas {
     public static void main(String[] args) {
        Scanner ler= new Scanner(System.in);
		double n1,n2,exame,media,mediaE;
		System.out.println("Digite a sua primeira nota");
		n1 = ler.nextDouble();
		System.out.println("Digite a sua segunda nota");
		n2 = ler.nextDouble();
		media=(n1+n2)/2;
		if (media<3) {
			System.out.println("Você está Reprovado");
		}
		else if (media>=6 ) {
			System.out.println("Você está Aprovado");
		}
		else if (media>=3 && media <6) {
			System.out.println("Você está em Exame");
		}
			System.out.println("Digite sua nota de Exame");
			exame = ler.nextDouble();
			mediaE=(exame+n1+n2)/3;
			if (mediaE>=6) {
				System.out.println("Você está Aprovado");
			}
			else if (mediaE<6) {
				System.out.println("Você está Reprovado");
			}
	ler.close();
		}
}
